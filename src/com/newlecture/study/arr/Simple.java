package com.newlecture.study.arr;

public class Simple {

	public static void main(String[] args) {
		
		int[] numberList = new int[10];
//		
//		System.out.println(numberList[2]);
//		
//		for(int i=0; i<10; i++)
//			numberList[i] = i+1;
//		
//		System.out.println(numberList.length);
//		
//		for(int i=0; i<10; i++)
//			if(i%2==1)
//				System.out.println(numberList[i]);
		
		
		int[] nums = {10,20,30,40,50,60,70,80,90,100,110,120,130,140};
		
			for(int i=0; i<4; i++)
				System.out.println(nums[i*3+2]);
	}
}
