package com.panda.product.core.model;

import java.util.Date;
import java.util.List;

public class PurchaseReturn {
	private Long id;

	private Long orderId;

	private Long orderNo;

	private String omsPorderSn;

	private Integer orderType;

	private Integer returnType;

	private Integer orderStatus;

	private Integer acctId;

	private String acctName;

	private Integer ownerId;

	private Integer locId;

	private String locName;

	private Integer carrierId;

	private String carrierName;

	private Integer totalSkuCnt;

	private Integer totalQty;

	private Date inWareDate;

	private Date planPickDate;

	private Integer planPickId;

	private String planPickName;

	private Date qcDate;

	private Integer qcId;

	private String qcName;

	private Date shipDate;

	private Integer shipId;

	private String shipName;

	private Date closeDate;

	private Integer closeId;

	private String closeName;

	private String comments;

	private Date entryDatetime;

	private Integer entryId;

	private String entryName;

	private String shipToAddr;

	private String shipToAccount;

	private String shipToPhone;

	private String shipToTel;

	private String shipToZip;

	private String shipToPobox;

	private String shipToProvince;

	private String shipToCity;

	private Integer cityId;

	private String shipToDistrict;

	private Integer districtId;

	private Integer sendCnt;

	private Integer sendQty;

	private String shipMethod;

	private List<PurchaseReturnDetail> purchaseDetailList;

	public String getShipToAddr() {
		return shipToAddr;
	}

	public void setShipToAddr(String shipToAddr) {
		this.shipToAddr = shipToAddr;
	}

	public String getShipToAccount() {
		return shipToAccount;
	}

	public void setShipToAccount(String shipToAccount) {
		this.shipToAccount = shipToAccount;
	}

	public String getShipToPhone() {
		return shipToPhone;
	}

	public void setShipToPhone(String shipToPhone) {
		this.shipToPhone = shipToPhone;
	}

	public String getShipToTel() {
		return shipToTel;
	}

	public void setShipToTel(String shipToTel) {
		this.shipToTel = shipToTel;
	}

	public String getShipToZip() {
		return shipToZip;
	}

	public void setShipToZip(String shipToZip) {
		this.shipToZip = shipToZip;
	}

	public String getShipToPobox() {
		return shipToPobox;
	}

	public void setShipToPobox(String shipToPobox) {
		this.shipToPobox = shipToPobox;
	}

	public String getShipToProvince() {
		return shipToProvince;
	}

	public void setShipToProvince(String shipToProvince) {
		this.shipToProvince = shipToProvince;
	}

	public String getShipToCity() {
		return shipToCity;
	}

	public void setShipToCity(String shipToCity) {
		this.shipToCity = shipToCity;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getShipToDistrict() {
		return shipToDistrict;
	}

	public void setShipToDistrict(String shipToDistrict) {
		this.shipToDistrict = shipToDistrict;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public Integer getSendCnt() {
		return sendCnt;
	}

	public void setSendCnt(Integer sendCnt) {
		this.sendCnt = sendCnt;
	}

	public Integer getSendQty() {
		return sendQty;
	}

	public void setSendQty(Integer sendQty) {
		this.sendQty = sendQty;
	}

	public String getShipMethod() {
		return shipMethod;
	}

	public void setShipMethod(String shipMethod) {
		this.shipMethod = shipMethod;
	}

	public String getPlanPickName() {
		return planPickName;
	}

	public void setPlanPickName(String planPickName) {
		this.planPickName = planPickName;
	}

	public String getQcName() {
		return qcName;
	}

	public void setQcName(String qcName) {
		this.qcName = qcName;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getCloseName() {
		return closeName;
	}

	public void setCloseName(String closeName) {
		this.closeName = closeName;
	}

	public String getEntryName() {
		return entryName;
	}

	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}

	public List<PurchaseReturnDetail> getPurchaseDetailList() {
		return purchaseDetailList;
	}

	public void setPurchaseDetailList(List<PurchaseReturnDetail> purchaseDetailList) {
		this.purchaseDetailList = purchaseDetailList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}

	public String getOmsPorderSn() {
		return omsPorderSn;
	}

	public void setOmsPorderSn(String omsPorderSn) {
		this.omsPorderSn = omsPorderSn == null ? null : omsPorderSn.trim();
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Integer getReturnType() {
		return returnType;
	}

	public void setReturnType(Integer returnType) {
		this.returnType = returnType;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getAcctId() {
		return acctId;
	}

	public void setAcctId(Integer acctId) {
		this.acctId = acctId;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName == null ? null : acctName.trim();
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public Integer getLocId() {
		return locId;
	}

	public void setLocId(Integer locId) {
		this.locId = locId;
	}

	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName == null ? null : locName.trim();
	}

	public Integer getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(Integer carrierId) {
		this.carrierId = carrierId;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName == null ? null : carrierName.trim();
	}

	public Integer getTotalSkuCnt() {
		return totalSkuCnt;
	}

	public void setTotalSkuCnt(Integer totalSkuCnt) {
		this.totalSkuCnt = totalSkuCnt;
	}

	public Integer getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(Integer totalQty) {
		this.totalQty = totalQty;
	}

	public Date getInWareDate() {
		return inWareDate;
	}

	public void setInWareDate(Date inWareDate) {
		this.inWareDate = inWareDate;
	}

	public Date getPlanPickDate() {
		return planPickDate;
	}

	public void setPlanPickDate(Date planPickDate) {
		this.planPickDate = planPickDate;
	}

	public Integer getPlanPickId() {
		return planPickId;
	}

	public void setPlanPickId(Integer planPickId) {
		this.planPickId = planPickId;
	}

	public Date getQcDate() {
		return qcDate;
	}

	public void setQcDate(Date qcDate) {
		this.qcDate = qcDate;
	}

	public Integer getQcId() {
		return qcId;
	}

	public void setQcId(Integer qcId) {
		this.qcId = qcId;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public Integer getShipId() {
		return shipId;
	}

	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public Integer getCloseId() {
		return closeId;
	}

	public void setCloseId(Integer closeId) {
		this.closeId = closeId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments == null ? null : comments.trim();
	}

	public Date getEntryDatetime() {
		return entryDatetime;
	}

	public void setEntryDatetime(Date entryDatetime) {
		this.entryDatetime = entryDatetime;
	}

	public Integer getEntryId() {
		return entryId;
	}

	public void setEntryId(Integer entryId) {
		this.entryId = entryId;
	}
}