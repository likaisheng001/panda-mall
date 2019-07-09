package com.panda.product.core.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class StockReceipt {

	private long receiptId;
	private int warehouseId;
	private long skuId;
	private int bussinessType;
	private int operationType;
	private String content;
	private int isserialNumberGenerator;
	
	public int getIsserialNumberGenerator() {
		return isserialNumberGenerator;
	}

	public void setIsserialNumberGenerator(int isserialNumberGenerator) {
		this.isserialNumberGenerator = isserialNumberGenerator;
	}

	public long getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(long receiptId) {
		this.receiptId = receiptId;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	public long getSkuId() {
		return skuId;
	}

	public void setSkuId(long skuId) {
		this.skuId = skuId;
	}

	public int getBussinessType() {
		return bussinessType;
	}

	public void setBussinessType(int bussinessType) {
		this.bussinessType = bussinessType;
	}

	public int getOperationType() {
		return operationType;
	}

	public void setOperationType(int operationType) {
		this.operationType = operationType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
