package com.newlecture.study.market;

public class History {
	
	private int idx;
	private String name;
	private String product;
	private int date;
	private String address;
	
	public History() {
		date = 20231221;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
