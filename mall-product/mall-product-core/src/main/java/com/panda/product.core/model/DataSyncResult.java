package com.panda.product.core.model;

public class DataSyncResult {
	/** 1:成功; -1:失败 */
	private int status;
	/** 失败原因 */
	private String cause;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}
}

