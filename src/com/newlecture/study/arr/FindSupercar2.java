package com.newlecture.study.arr;

public class FindSupercar2 {
	public static void main(String[] args) {
		
		int[] superCars = { 100, 320, 56, 220, 49, 300};
		int n = superCars.length;
		int temp=0;
		int tempi=0;
				
		for(int i=0; i<n; i++) {
			if(temp<superCars[i]) {
				temp = superCars[i];
				tempi = i+1;
			}
		}
		System.out.printf("가장 빠른 차는 %d번째\n", tempi);
		
		for(int i=0; i<n; i++) {
			if(superCars[i]==56) {
				tempi = i;
			}
		}
		System.out.printf("클래식 슈퍼카의 인덱스는 %d", tempi);
	}
}
