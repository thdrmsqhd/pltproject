package com.spring.plt.manuFac.vo;

import org.springframework.stereotype.Component;

@Component
public class ManuFacVO {
	private String id;
	private String pwd;
	private String manuName;
	private String manuCeoName;
	private String manuEmail;
	private String manuBizNo;
	private String manuBizType;
	private String manuAddr;
	private String manuDetailAddr;
	private String manuTel;
	private String manuStart;
	private String manuDetail;
	private String manuImg;
	private int productPrice;
	private String manuAuth;
	private String Type;
	
	
	public String getManuDetailAddr() {
		return manuDetailAddr;
	}
	public void setManuDetailAddr(String manuDetailAddr) {
		this.manuDetailAddr = manuDetailAddr;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getManuName() {
		return manuName;
	}
	public void setManuName(String manuName) {
		this.manuName = manuName;
	}
	public String getManuCeoName() {
		return manuCeoName;
	}
	public void setManuCeoName(String manuCeoName) {
		this.manuCeoName = manuCeoName;
	}
	public String getManuEmail() {
		return manuEmail;
	}
	public void setManuEmail(String manuEmail) {
		this.manuEmail = manuEmail;
	}
	public String getManuBizNo() {
		return manuBizNo;
	}
	public void setManuBizNo(String manuBizNo) {
		this.manuBizNo = manuBizNo;
	}
	public String getManuBizType() {
		return manuBizType;
	}
	public void setManuBizType(String manuBizType) {
		this.manuBizType = manuBizType;
	}
	public String getManuAddr() {
		return manuAddr;
	}
	public void setManuAddr(String manuAddr) {
		this.manuAddr = manuAddr;
	}
	public String getManuTel() {
		return manuTel;
	}
	public void setManuTel(String manuTel) {
		this.manuTel = manuTel;
	}
	public String getManuStart() {
		return manuStart;
	}
	public void setManuStart(String manuStart) {
		this.manuStart = manuStart;
	}
	public String getManuDetail() {
		return manuDetail;
	}
	public void setManuDetail(String manuDetail) {
		this.manuDetail = manuDetail;
	}
	public String getManuImg() {
		return manuImg;
	}
	public void setManuImg(String manuImg) {
		this.manuImg = manuImg;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getManuAuth() {
		return manuAuth;
	}
	public void setManuAuth(String manuAuth) {
		this.manuAuth = manuAuth;
	}
	
	public String toString() {
		String info = "";
		info += "\n"+id+"\n "
			        +pwd+"\n"
			        +manuName+"\n"
			        +manuCeoName+"\n"
			        +manuEmail+"\n"
			        +manuBizNo+"\n"
			        +manuBizType+"\n"
			        +manuAddr+"\n"
			        +manuTel+"\n"
			        +manuStart+"\n"
			        +manuDetail+"\n"
			        +manuImg+"\n"
			        +productPrice;
		
		return info;
	}
}