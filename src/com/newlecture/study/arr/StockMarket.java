package com.newlecture.study.arr;

public class StockMarket {
	public static void main(String[] args) {
		
		int[] prices = { 120, 140, 180, 240, 220, 205, 180};
		int n = prices.length;
		int temp=0;
		int tempn=0;

		for(int i=0; i<n-1; i++) {
			
			int degree=Math.abs(prices[i]-prices[++i]);
			
			if(temp<degree) {
				temp = degree;
				tempn = i;
			}
			i--;
		}

		System.out.printf("가장 변동이 큰 날 :  %d일\n", tempn);
		System.out.printf("최대 변동값: %d", temp);

			 
	}
}