package com.newlecture.proj4.poly;

public class MenuList {
	private int count;
	private int index;
	private Menu[] menus;
	
	public MenuList() {
//		count = 5;
//		index = 0;
//		menus = new Menu[count];
		this(5);		
		
		for(int i=0; i<5; i++) {
			menus[i] = new Menu();
		}
	}
	
	public MenuList(int count) {
		this.count = count;
		index = 0;
		menus = new Menu[count];
	}

	public void add(Menu menu) {
		menus[index++] = menu;
	}
	
	public int size() {
		return index;
	}

	public Menu get(int index) {
		
		return menus[index];
	}
}
