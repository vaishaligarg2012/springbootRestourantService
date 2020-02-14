package com.infogain.restaurant.enums;

public enum USERTYPE {
	
CORPORATE("corporate"),NORMAL("normal");
	private String lable;
	USERTYPE(String lable) {
		this.lable=lable;
	}
	public String getLable() {
		return lable;
	}
	public void setLable(String lable) {
		this.lable = lable;
	}
}
