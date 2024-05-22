package com.newlecture.proj4.poly;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileMenuRepository implements MenuRepository {
		
	private String dataSource;
	
	public FileMenuRepository() {
		dataSource = "res/menu.csv";
	}
	
	// overload (instance) method
	public List<Menu> findAll(int page){
		List<Menu> list = new ArrayList<>();
		
		try {
			int size = 10;
			int offset = (page-1)*size;
			
			//MenuList list = new MenuList();
			FileInputStream fis = new FileInputStream(dataSource);
			Scanner scan = new Scanner(fis);
			scan.nextLine();	
			
			while(scan.hasNextLine()) {
				Menu menu = new Menu();
				String line = scan.nextLine();
				String[] tokens = line.split(",");
				
				menu.setId(Integer.parseInt(tokens[0]));
				menu.setKorName(tokens[1]);
				menu.setEngName(tokens[2]);
				menu.setPrice(Integer.parseInt(tokens[3]));
				menu.setLike(Integer.parseInt(tokens[4]));
				menu.setImg(tokens[5]);
				
				list.add(menu);
			}
			scan.close();
			fis.close();		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	// default (instance) method
	public List<Menu> findAll() {
		return findAll(0);
	}

	public void save(Menu menu){
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(dataSource, true);
			PrintStream fout = new PrintStream(fos);
			
			fout.printf(
					"\n%d,%s,%s,%d,%d,%s",
					menu.getId(),//menu.id, 
					menu.getKorName(), 
					menu.getEngName(), 
					menu.getPrice(), 
					menu.getLike(), 
					menu.getImg());
			
			fout.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
