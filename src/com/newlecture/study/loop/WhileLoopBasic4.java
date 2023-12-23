package com.newlecture.study.loop;

public class WhileLoopBasic4{
	public static void main(String[] args) {
		
		int i = 0;
		int num = 1;
		
		while(i<100) {
		
			if( num%3 == 0 || num%5 == 0 ) {
			System.out.println(num);
			}
			num++;
			i++;
		}
		
	}
}
	

