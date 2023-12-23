package com.newlecture.study.loop;

public class Asterisk2 {
	public static void main(String[] args) {
		
		char star = '*';
		
		for(int i=0, t=1 ; i<5 ; i++, t++) {
			
			int n = 1;
			while(n<=5-t) {
				System.out.print(" ");
				n++;
			}
			
			n=1;
			while(n<=t) {
				System.out.print(star);
				n++;
			}
			
			System.out.println();
				
		}
		
	}
	
}
