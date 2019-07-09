package com.vulcan.product.job;
import java.util.Date;
import java.util.List;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.MessageQueueSelector;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.common.message.MessageQueue;

public class OrderProducer {
    public static void main(String[] args) throws MQClientException {
        DefaultMQProducer producer = new DefaultMQProducer("testGroup");
        producer.setNamesrvAddr("10.254.128.130:9876");
        producer.setInstanceName("producer");
        producer.setRetryTimesWhenSendFailed(10);  //当发送失败的时候，重新发送10次
        producer.start();
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);  //每秒发送一次MQ
                Message msg = new Message("TopicA-test","TAG",(new Date() + "顺序消息:" + i).getBytes());
                //设置消息的延迟级别
//                msg.setDelayTimeLevel(3);
                Integer bankCount = 1000;
                SendResult sendResult = producer.send(msg,new MessageQueueSelector() {
					
					@Override
					public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
						Integer num = (Integer)arg;
						num = num == null ? 0 : num;
						int size = mqs.size();
						int queueIdx = num % size;
						return mqs.get(queueIdx);
					}
					
				},bankCount);

                System.out.println("发送了一条消息!!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        producer.shutdown();
    }
}

