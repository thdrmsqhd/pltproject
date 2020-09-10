package com.spring.plt.production.vo;

import org.springframework.stereotype.Component;

@Component
public class ProductionVO {
	private int no;
	private String compId;
	private String manuId;
	private String tempSave;
	private String reqOrder;
	private int orderStatus;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCompId() {
		return compId;
	}
	public void setCompId(String compId) {
		this.compId = compId;
	}
	public String getManuId() {
		return manuId;
	}
	public void setManuId(String manuId) {
		this.manuId = manuId;
	}
	public String getTempSave() {
		return tempSave;
	}
	public void setTempSave(String tempSave) {
		this.tempSave = tempSave;
	}
	public String getReqOrder() {
		return reqOrder;
	}
	public void setReqOrder(String reqOrder) {
		this.reqOrder = reqOrder;
	}
	public int getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
}
