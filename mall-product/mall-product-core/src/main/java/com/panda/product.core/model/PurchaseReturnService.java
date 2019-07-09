package com.panda.product.core.model;

import javax.jws.WebService;

@WebService
public interface PurchaseReturnService {

	public DataSyncResult PurchaseReturnSave(PurchaseReturn purchaseReturn);
	
}
