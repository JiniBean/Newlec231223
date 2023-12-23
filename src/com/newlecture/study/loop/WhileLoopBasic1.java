package com.newlecture.study.loop;

public class WhileLoopBasic1 {
	public static void main(String[] args) {
		
		int i = 0;
		int num = 0;
		int temp = 1;
		
		while(i<100) {
		
			num = temp + num;
			temp++;
			i++;
		}
		System.out.println(num);
	}
}