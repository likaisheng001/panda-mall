package com.vulcan.product.job.service.impl;

import java.util.concurrent.atomic.AtomicInteger;

import com.alibaba.rocketmq.client.producer.LocalTransactionState;
import com.alibaba.rocketmq.client.producer.TransactionCheckListener;
import com.alibaba.rocketmq.common.message.MessageExt;

/**
 * 未决事务，服务器回查客户端，broker端发起请求代码没有被调用，所以此处代码可能没用
 * @author likaisheng
 *
 */
public class TransactionCheckListenerImpl implements TransactionCheckListener{

	private AtomicInteger transactionIndex = new AtomicInteger(0);
	
	@Override
	public LocalTransactionState checkLocalTransactionState(MessageExt msg) {
		System.out.println("server checking TrMsg " + msg.toString());
		
		return LocalTransactionState.COMMIT_MESSAGE;
	}
}
