package com.newlecture.study.arr;

public class ArrStudy {
	public static void main(String[] args) {
		
		int[] arr = {6, 3, 5, 2, 7, 4, 1, 8};
		
		for(int i=0; i<arr.length-1; i++)
			for(int j=0; j<arr.length-(1+i); j++) { 
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				System.out.printf(" i=%d j=%d   %d, %d, %d, %d, %d, %d, %d, %d\n",i, j, arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
			}
		
		


	}
}
