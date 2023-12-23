package com.newlecture.study.loop;

public class ForLoopBasic2 {
	public static void main(String[] args) {
		
		int temp=0;
		
		for(int i=0, n=1 ; i<10 ; i++, n++) {
			
			
			if(n%2==0) {
				temp = temp + n;
			}
		}
		System.out.println(temp);
	}
}
