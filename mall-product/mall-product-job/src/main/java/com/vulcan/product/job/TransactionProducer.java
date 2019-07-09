package com.vulcan.product.job;

import java.util.Date;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.LocalTransactionExecuter;
import com.alibaba.rocketmq.client.producer.TransactionMQProducer;
import com.alibaba.rocketmq.client.producer.TransactionSendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.vulcan.product.job.service.impl.TransactionCheckListenerImpl;
import com.vulcan.product.job.service.impl.TransactionExecuterImpl;

/**
 * 发送事务消息例子
 * 分布式事务的思路是：数据的最终一致性
 * @author likaisheng
 *
 */
public class TransactionProducer {
	public static void main(String[] args) throws MQClientException {
		
		TransactionCheckListenerImpl transactionCheckListener = new TransactionCheckListenerImpl();
		
		TransactionMQProducer producer = new TransactionMQProducer("testGroup");
		producer.setNamesrvAddr("10.254.128.130:9876");
		producer.setTransactionCheckListener(transactionCheckListener);
		//事务回查最大并发数
		producer.setCheckThreadPoolMaxSize(2);
		//事务回查最小并发数
		producer.setCheckThreadPoolMaxSize(2);
		
		producer.start();
		
//		rocketmq.namesrv_addr=10.254.128.130:9876
//		rocketmq.trace_level=ALL
//		rocketmq.producer_id=PID_BKSUPPLIER_0001
//		rocketmq.consumer_id=CID_BKSUPPLIER_0001 	
		
		TransactionExecuterImpl transactionExecuter = new TransactionExecuterImpl();
		
		try {
			Message msg = new Message("TopicA-test","TAG1","KEY1",("Hello RocketMQ 1").getBytes());
			
			Thread.sleep(10);
			
			Message msg2 = new Message("TopicA-test","TAG2","KEY2",("Hello RocketMQ 2").getBytes());
			
			TransactionSendResult sendResult = producer.sendMessageInTransaction(msg, transactionExecuter, null);
			System.out.println(new Date() + "msg1:" + sendResult);
			
			sendResult = producer.sendMessageInTransaction(msg2, transactionExecuter, null);
			System.out.println(new Date() + "msg2:" + sendResult);
			
			
			for(int i = 0; i < 1000; i++){
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		producer.shutdown();
	}
}
