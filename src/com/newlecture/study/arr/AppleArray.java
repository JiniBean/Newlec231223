package com.newlecture.study.arr;

public class AppleArray {
	public static void main(String[] args) {
		
		int[] apples = { 10, 34 };
		
		System.out.println("사과의 위치를 바꾸기 전:");
		for(int apple : apples)
			System.out.printf("%d ", apple);
		
		System.out.println("\n사과의 위치를 바꾼 후: ");
		
		for(int i=0; i<apples.length; i++){
			for(int j=i+1; j<apples.length; j++)
				if(apples[i]<apples[j]) {
					int apple = apples[i];
					apples[i] = apples[j];
					apples[j] = apple;
				}
		}
		for(int apple : apples)
			System.out.printf("%d ", apple);
	}
	
}
