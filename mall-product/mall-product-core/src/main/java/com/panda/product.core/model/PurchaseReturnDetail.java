package com.panda.product.core.model;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseReturnDetail {
	  private Long orderLineId;

	    private Long orderId;

	    private Integer orderLineNo;

	    private Integer skuNo;

	    private String lot;

	    private Integer orderQty;

	    private Integer qcQty;

	    private Integer discrepQty;

	    private BigDecimal unitCost;

	    private Date inWareDate;

	    private Integer version;

	    private Integer invType;
	    
	    
	    

  public Integer getInvType() {
			return invType;
		}

		public void setInvType(Integer invType) {
			this.invType = invType;
		}

	public Long getOrderLineId() {
      return orderLineId;
  }

  public void setOrderLineId(Long orderLineId) {
      this.orderLineId = orderLineId;
  }

  public Long getOrderId() {
      return orderId;
  }

  public void setOrderId(Long orderId) {
      this.orderId = orderId;
  }

  public Integer getOrderLineNo() {
      return orderLineNo;
  }

  public void setOrderLineNo(Integer orderLineNo) {
      this.orderLineNo = orderLineNo;
  }

  public Integer getSkuNo() {
      return skuNo;
  }

  public void setSkuNo(Integer skuNo) {
      this.skuNo = skuNo;
  }

  public String getLot() {
      return lot;
  }

  public void setLot(String lot) {
      this.lot = lot == null ? null : lot.trim();
  }

  public Integer getOrderQty() {
      return orderQty;
  }

  public void setOrderQty(Integer orderQty) {
      this.orderQty = orderQty;
  }

  public Integer getQcQty() {
      return qcQty;
  }

  public void setQcQty(Integer qcQty) {
      this.qcQty = qcQty;
  }

  public Integer getDiscrepQty() {
      return discrepQty;
  }

  public void setDiscrepQty(Integer discrepQty) {
      this.discrepQty = discrepQty;
  }

  public BigDecimal getUnitCost() {
      return unitCost;
  }

  public void setUnitCost(BigDecimal unitCost) {
      this.unitCost = unitCost;
  }

  public Date getInWareDate() {
      return inWareDate;
  }

  public void setInWareDate(Date inWareDate) {
      this.inWareDate = inWareDate;
  }

  public Integer getVersion() {
      return version;
  }

  public void setVersion(Integer version) {
      this.version = version;
  }

  
}