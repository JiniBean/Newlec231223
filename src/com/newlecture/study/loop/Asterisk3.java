package com.newlecture.study.loop;

public class Asterisk3 {
	public static void main(String[] args) {
		
		char star = '*';
		
		for(int i=0, t=1 ; i<5 ; i++, t++) {
			
			int n = 1;
			while(n<=5-t) {
				System.out.print(" ");
				n++;
			}
			
			n=2;
			while(n<=t*2) {
				System.out.print(star);
				n++;
			}
			
			System.out.println();
				
		}
		
		
	}
	
}
