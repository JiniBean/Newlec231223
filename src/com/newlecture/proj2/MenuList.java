package com.newlecture.proj2;


public class MenuList {
	private Menu[] menus;
	private int count;
	private int idx;
	
	
	public MenuList() {
		this(5);
	}
	

	public MenuList(int count) {
		this.count = count;
		idx = 0;
		menus = new Menu[count];
	}


	public void add(Menu menu) {
		
		if( !(menus[count-1]==null) ) {
			Menu[] temp = new Menu[count+1];
			
			for(int i=0; i<count; i++)
				temp[i] = menus[i];
			menus = temp;
			count++;
		}
		
		menus[idx] = menu;
		idx++;
	}


	public int size() {
		int size = count;
		
		return size;
	}


	public Menu get(int i) {
		Menu menu = menus[i];
		return menu;
	}
	
}
