package com.bit.model.dto;


import java.sql.Date;

public class ReviewDto {
	int num;//�۹�ȣ
	String sub;//����
	String cont;//����
	Date wday;//�ۼ���
	
	public ReviewDto () {
		
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	public Date getWday() {
		return wday;
	}
	public void setWday(Date wday) {
		this.wday = wday;
	}
	
}
