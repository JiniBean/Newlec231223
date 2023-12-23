package com.newlecture.study.loop;

public class Asterisk1 {
	public static void main(String[] args) {
		
		char star = '*';
		
		for(int i=0, t=1 ; i<5 ; i++, t++) {
			
			int n = 1;
			
			while(n<=t) {
				System.out.print(star);
				n++;
			}
			
			System.out.println();
				
		}
		
	}
	
}
