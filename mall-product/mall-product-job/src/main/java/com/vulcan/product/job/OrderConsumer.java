package com.vulcan.product.job;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeOrderlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeOrderlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerOrderly;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.panda.mall.common.util.JSONUtil;

public class OrderConsumer {
    public static void main(String[] args) throws MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(
                "testGroup");

        consumer.setNamesrvAddr("10.254.128.130:9876");
        consumer.setInstanceName("consumer");
        consumer.subscribe("TopicA-test", "*");  //消费端订阅topic
        
        consumer.registerMessageListener(new MessageListenerOrderly() {
			
        	AtomicLong consumeTimes = new AtomicLong(0);
        	
			@Override
			public ConsumeOrderlyStatus consumeMessage(List<MessageExt> msgs, ConsumeOrderlyContext context) {
				
				context.setAutoCommit(true);
				System.out.println(Thread.currentThread().getName() + " Receive New Message: " + msgs);
				this.consumeTimes.incrementAndGet();
				
				try {
					//模拟一个异常
					if(consumeTimes.intValue() % 2 == 0){
						int i = 10 / 0;
					}
					//模拟业务处理消息的时间
					 MessageExt messageExt = msgs.get(0);
					 System.out.println("消费成功:" + JSONUtil.toJSON(messageExt));
					Thread.sleep(new Random().nextInt(1000));
					System.out.println(new String(msgs.get(0).getBody(),"UTF-8"));
				} catch (Exception e) {
					e.printStackTrace();
					return ConsumeOrderlyStatus.SUSPEND_CURRENT_QUEUE_A_MOMENT;
				}
				
				return ConsumeOrderlyStatus.SUCCESS;
			}
		});
        
        consumer.start();
        System.out.println("Consumer Started.");
    }
}