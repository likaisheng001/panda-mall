package com.panda.product.core.model;

/**
 * 
 * 库存服务返回结果 1:成功; -1:失败 
 * 
 * @author liangjun
 * 
 */
public class StockResult {

    /** 1:成功; -1:失败 */
    private int result;
    /** 失败原因 */
    private String cause;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

}
