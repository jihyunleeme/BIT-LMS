package com.bit.model.dto;

import java.sql.Date;

public class CounselDto {
	int num;//글번호
	String sub;//제목
	String cont;//내용
	String wuser;//작성자
	Date wday;//작성일
	int pw; //비밀번호
	
	public CounselDto () {
		
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
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	
}
