package com.bit.model.dto;

import java.sql.Date;

public class AttendDto {
	String id;//���̵�
	String name;//�̸�
	Date day;//��¥
	int attend;//�⼮
	int out; //�Ἦ
	int tardy; //����
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public int getAttend() {
		return attend;
	}
	public void setAttend(int attend) {
		this.attend = attend;
	}
	public int getOut() {
		return out;
	}
	public void setOut(int out) {
		this.out = out;
	}
	public int getTardy() {
		return tardy;
	}
	public void setTardy(int tardy) {
		this.tardy = tardy;
	}
}