package com.app.model;

public class Student {
	
	private int id;
	private String name;
	private long mobno;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobno=" + mobno + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

}
