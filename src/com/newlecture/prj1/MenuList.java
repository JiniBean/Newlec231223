package com.newlecture.prj1;

import java.util.Scanner;


private class MenuList {
	private Menu[] menus;
	private int count;
	
	
	public MenuList() {
		this.count = 3;
		this.menus = new Menu[this.count];
	}
	
	
	public void printAll() {
		if(this.menus[0]==null ) {
			System.out.println("입력된 정보가 없습니다. 먼저 메뉴 정보를 입력해주세요.");
		}
		else {
			for(int i=0; i<this.count; i++)
				this.menus[i].print();
			System.out.println();
		}
	}
	
	public void inputMenu() {
		Scanner scan = new Scanner(System.in);
		
		boolean isRun = true;
		while(isRun) {
			Menu temps = new Menu();
			temps.input();
			
			for(int i=0; i<this.count; i++)
				if(this.menus[i] == null) {
					this.menus[i] = temps;
					break;
				}
			
			
			System.out.print("continue(yes/no) : ");
			String goStop = scan.nextLine();
			
			boolean more = goStop.equalsIgnoreCase("yes")? true : false;
			if(more && !(this.menus[this.count-1]==null) ) {
				Menu[] temp = new Menu[this.count+1];
				
				for(int i=0; i<this.count; i++)
					temp[i] = this.menus[i];
				this.menus = temp;
				this.count++;
			}
			else if(!more)
				isRun=false;
			continue;
			
		}
	}


	public void add(Menu menu) {
		
	}
}
