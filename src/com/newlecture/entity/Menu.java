package com.newlecture.entity;

public class Menu {
	private int id;
	private String korName;
	private String engName;
	private int price;
	private int like;
	private String img;
	
	public Menu(String korName, int price) {
		
		this.korName = korName;
		this.price = price;
	}
	
	public Menu() {
		this(null,0);
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKorName() {
		return korName;
	}

	public void setKorName(String korName) {
		this.korName = korName;
	}

	public String getEngName() {
		return engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", korName=" + korName + ", engName=" + engName + ", price=" + price + ", like="
				+ like + ", img=" + img + "]";
	}
	
	
}
