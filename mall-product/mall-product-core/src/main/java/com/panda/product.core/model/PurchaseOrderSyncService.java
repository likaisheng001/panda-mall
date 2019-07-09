package com.panda.product.core.model;

import javax.jws.WebService;

@WebService
public interface PurchaseOrderSyncService {
	public DataSyncResult syncPurchaseOrder(String jSonStr);
	
	public int checkOmsOrderIdExists(long omsOrderId);
}
