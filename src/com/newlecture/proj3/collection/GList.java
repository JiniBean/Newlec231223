package com.newlecture.proj3.collection;


public class GList<Empty>{
	private Empty[] menus;
	private int count;
	private int idx;
	
	
	public GList() {
		this(5);
	}
	

	public GList(int count) {
		this.count = count;
		idx = 0;
		menus = (Empty[])new Object[count];
	}


	public void add(Empty menu) {
		
		if( !(menus[count-1]==null) ) {
			Empty[] temp = (Empty[])new Object[count+1];
			
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


	public Empty get(int i) {
		Empty menu = menus[i];
		return menu;
	}
	
}
