package com.bit.model.dto;
public class ScoreDto {
	
	String id; //���̵�
	String name;//�̸�
	int java; //java ����
	int web; //web ����
	int db; //db����
	
	public ScoreDto() {
		
	}
	
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
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
}
