package com.newlecture.proj3.collection;


public class ObjectList {
	private Object[] menus;
	private int count;
	private int idx;
	
	
	public ObjectList() {
		this(5);
	}
	

	public ObjectList(int count) {
		this.count = count;
		idx = 0;
		menus = new Menu[count];
	}


	public void add(Object menu) {
		
		if( !(menus[count-1]==null) ) {
			Object[] temp = new Object[count+1];
			
			for(int i=0; i<count; i++)
				temp[i] = menus[i];
			menus = temp;
			count++;
		}
		
		menus[idx] = menu;
		idx++;
	}


	public int size() {
		
		return count;
	}


	public Object get(int i) {
		Object menu = menus[i];
		return menu;
	}
	
}
