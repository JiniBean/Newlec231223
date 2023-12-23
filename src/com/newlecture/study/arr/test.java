package com.newlecture.study.arr;

public class test {
	public static void main(String[] args) {
//		int[] nums = new int[10];
//		
//		for(int i=0, n=20; i<10; i++, n-=2)
//			nums[i] = n;
//		
//		for(int i=0; i<10; i++)
//		System.out.println(nums[i]);
//		
//		System.out.println();
		
		
		int[] nums = {10,20,30,40,50,60,70,80,90,100,110,120,130,140};
		
		for(int i=0; i<nums.length/2; i++) {
			nums[i*2] = 1;
		}
		
		for(int i=0; i<nums.length; i++)
		System.out.println(nums[i]);
		
	}
}
