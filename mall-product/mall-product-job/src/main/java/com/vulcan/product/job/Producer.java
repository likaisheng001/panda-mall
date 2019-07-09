package com.vulcan.product.job;
import java.util.Date;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.panda.mall.common.util.JSONUtil;

public class Producer {
    public static void main(String[] args) throws MQClientException {
        DefaultMQProducer producer = new DefaultMQProducer("testGroup");
        producer.setNamesrvAddr("10.254.128.130:9876");
        producer.setInstanceName("producer");
//        producer.setRetryTimesWhenSendFailed(10);  //当发送失败的时候，重新发送10次
        producer.start();
        try {
            for (int i = 0; i < 1; i++) {
                Thread.sleep(1000);  //每秒发送一次MQ
                Message msg = new Message("zjm_testTopic","TAG",(new Date() + "Hello RocketMQ ,QuickStart" + i + "--测试--retryMaxTimes -- 测试顺序").getBytes());
                //设置消息的延迟级别
//                msg.setDelayTimeLevel(3);

                SendResult sendResult = producer.send(msg);
                System.out.println("发送了一条消息!!!");
                System.out.println("message:" + JSONUtil.toJSON(msg));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        producer.shutdown();
    }
}

