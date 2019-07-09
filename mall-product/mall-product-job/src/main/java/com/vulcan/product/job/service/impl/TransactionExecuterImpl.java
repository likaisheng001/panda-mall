package com.vulcan.product.job.service.impl;

import java.util.concurrent.atomic.AtomicInteger;

import com.alibaba.rocketmq.client.producer.LocalTransactionExecuter;
import com.alibaba.rocketmq.client.producer.LocalTransactionState;
import com.alibaba.rocketmq.common.message.Message;
import com.google.common.base.FinalizablePhantomReference;

/**
 * 本地事务执行器
 * @author likaisheng
 *
 */
public class TransactionExecuterImpl implements LocalTransactionExecuter{

	private AtomicInteger transactionIndex = new AtomicInteger(1);
	
	@Override
	public LocalTransactionState executeLocalTransactionBranch(final Message msg, final Object arg) {
		
		System.out.println("执行本地事务msg = " + new String(msg.getBody()));
		System.out.println("执行本地事务arg = " + arg);
		
		String tags = msg.getTags();
		
		if(tags.equals("TAG2")){
			System.out.println("======我的操作=======,失败了  -进行ROLLBACK");
			return LocalTransactionState.ROLLBACK_MESSAGE;
		}
		return LocalTransactionState.COMMIT_MESSAGE;
	}
}
