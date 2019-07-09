package com.panda.product.core.model;

import java.io.Serializable;
import java.math.BigDecimal;


public class TaxCode implements Serializable{
	private Long id;
	private String code;
	private BigDecimal value=new BigDecimal("0.0000");
	private BigDecimal reValue = new BigDecimal(0.1300);
	private String taxCode = "J0";
	
	public String getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public BigDecimal getValue() {
		if(this.taxCode.equalsIgnoreCase("J0")){
			return reValue.setScale(4, BigDecimal.ROUND_HALF_UP);
		}
		
		return value.setScale(4, BigDecimal.ROUND_HALF_UP);
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public BigDecimal getReValue() {
		return reValue;
	}
	public void setReValue(BigDecimal reValue) {
		this.reValue = reValue;
	}
	
}
