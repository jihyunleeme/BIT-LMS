package com.bit.model.dto;
import java.sql.Date;

public class ReplyDto {
	int num;//글번호
	String sub;//제목
	String cont;
	String wuser;//작성자
	Date wday;//작성일
	
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
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
	public String getWuser() {
		return wuser;
	}
	public void setWuser(String wuser) {
		this.wuser = wuser;
	}
	public Date getWday() {
		return wday;
	}
	public void setWday(Date wday) {
		this.wday = wday;
	}
	
}