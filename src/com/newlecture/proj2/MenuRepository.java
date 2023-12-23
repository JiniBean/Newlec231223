package com.newlecture.proj2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class MenuRepository {

	//overload instance method
	public MenuList findAll(int page) throws IOException {
		int size = 10;
		int offset = (page-1)*size;
		
		MenuList menuList = new MenuList(10);
		
		FileInputStream stream = new FileInputStream("res/menu.csv");
		Scanner scan = new Scanner(stream);
		
		//컬럼 버리기
		if(scan.hasNextLine())
			scan.nextLine();
		
		
		while(scan.hasNextLine()) {
			
			Menu menu = new Menu();
			
			String line = scan.nextLine();
			String[] tokens = line.split(",");
			
			menu.setId(Integer.parseInt(tokens[0]));
			menu.setKorName(tokens[1]);
			menu.setEngName(tokens[2]);
			menu.setPrice(Integer.parseInt(tokens[3]));
			menu.setImg(tokens[4]);
		
			menuList.add(menu);
		}
		scan.close();
		stream.close();
		
		return menuList;
	}
	
	public MenuList findAll() throws IOException {
				
		return findAll(0);
	}

	
	public void save(Menu menu) throws IOException {
		FileOutputStream stream = new FileOutputStream("res/menu.csv", true);
		PrintStream pis = new PrintStream(stream);
		
		pis.printf("\n%d,%s,%s,%d,%d,%s",menu.getId(), menu.getKorName(), menu.getEngName(), menu.getPrice(), menu.getLikes(), menu.getImg() );
		
		pis.close();
		stream.close();
	}


	

}
