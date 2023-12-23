package com.newlecture.study.arr;

public class FindSupercar3 {
	public static void main(String[] args) {
		
		int[] superCars = { 100, 320, 56, 220, 49, 300};
		int n = superCars.length;
		int temp=0;
		int tempn=0;
		
		for(int i=0; i<n; i++) 
			temp += superCars[i];
		
		temp /= n; 
		
		for(int i=0; i<n; i++) 
			if(temp<superCars[i])
				tempn +=1;
		
		System.out.printf("평균 속도: %d\n", temp);
		System.out.printf("평균 속도보다 빠른 차의 수: %d대", tempn);

	}
}
