package com.vulcan.product.job;
import java.util.List;
import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.client.exception.MQClientException;
//import com.alibaba.rocketmq.common.consumer.ConsumeFromWhere;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.panda.mall.common.util.JSONUtil;

//rocketmq.namesrv_addr=10.254.128.130:9876
//rocketmq.trace_level=ALL
//rocketmq.producer_id=PID_BKSUPPLIER_0001
//rocketmq.consumer_id=CID_BKSUPPLIER_0001

public class ConcurrentConsumer {
    public static void main(String[] args) throws MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(
                "testGroup");

        consumer.setNamesrvAddr("10.254.128.130:9876");
        consumer.setInstanceName("consumer");
        consumer.subscribe("TopicA-test", "*");  //消费端订阅topic
        
//        consumer.setConsumeMessageBatchMaxSize(10); //批量消费的设置,每次拉取10条,默认是1条  
        /** 
         * 设置Consumer第一次启动是从队列头部开始消费还是队列尾部开始消费<br> 
         * 如果非第一次启动，那么按照上次消费的位置继续消费 
         */  
//        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);

        //并发监听消息
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(
                    List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
            	try {
            		System.out.println("开始消费："+JSONUtil.toJSON(msgs));
            		
            		//加入消息重试的补偿机制
            		int reconsumeTimes = msgs.get(0).getReconsumeTimes(); //获取消息重试的次数
            		//如果消息重试了10次，可以让程序执行一些额外的操作，比如写到日志了，或发送提醒什么的，或者就默认该条消息消费成功
            		if(reconsumeTimes == 5){
            			System.out.println("进入补偿机制："+JSONUtil.toJSON(msgs));
            			return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            		}
            		
            		for (MessageExt msg : msgs) {
                        System.out.println(new String(msg.getBody()));
                    }
//            		int i = 10 / 0;
                    return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
				} catch (Exception e) {
					System.out.println("发生异常，稍后消费 " + JSONUtil.toJSON(msgs));
					return ConsumeConcurrentlyStatus.RECONSUME_LATER;
				}
            }
        });
        consumer.start();
        System.out.println("Consumer Started.");
    }
}