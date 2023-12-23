package com.newlecture.study.loop;

public class WhileLoopBasic3 {
	public static void main(String[] args) {
		
		int num = 1;
		int i = 0;
		
		do {
			
			if(num%2 == 1) {
				System.out.println(num);
				}
				num++;
				i++;
		}
		while(i<100);
		
	}
}
