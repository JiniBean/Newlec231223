package com.newlecture.entity;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class MenuRepository {

	private String dataSource;
	
	public MenuRepository() {
		
	}
	
	public MenuList findAll() {
		
		return findAll(-1);
	}

	public MenuList findAll(int page) {
		
		return null;
	}
	
	public Menu findbyId(int id) {
		return null;
	}
	
	public MenuList findAllByName(String korName) {
		
		return null;
	}
	
	public void save(Menu menu) throws IOException {
		FileOutputStream stream = new FileOutputStream("res/menus.csv", true);
		PrintStream pis = new PrintStream(stream);
		
		pis.printf("\n%d,%s,%s,%d,%d,%s", menu.getId(), menu.getKorName(), menu.getEngName(), menu.getPrice(), menu.getLike(), menu.getImg());
		
		pis.close();
		stream.close();
	}
	
	public void deleteAll(int[] ids) {
		
		MenuList list =  new  MenuList();
		
		for(int i=0; i<ids.length; i++) {
			Menu menu = list.get(ids[i]);
			list.remove(menu);
		}
	}
	
	
}
