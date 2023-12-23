package com.newlecture.study.arr;

public class Simple2 {
	public static void main(String[] args) {
		
		int[] nums = {2, 3, 42, 4, 5, 56, 5, 32, 100, 96};
		int m = nums.length;
		
		for(int i=0, n=m-1; i<m; i++, n--)
			System.out.println(nums[n]);
		
		for(int i=0; i<m; i++) {
			nums[i] *= 2;
			System.out.println(nums[i]);
		}
		
	}
}
