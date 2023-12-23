package com.newlecture.study.string;

public class FindLongestSupercar {
	public static void main(String[] args) {
		String[] supercars= {"Lamborghini Sesto Elemento", "Mercrdedes-Benz SLRMcLaren", "ASTON MARTIN Victor", "Ferrari 360 modena"};
		
		String a = "";
		
		for(int i=0; i<supercars.length;i++) {
			int idx = a.length();
			int idx1 = supercars[i].length();
		
			if(idx<idx1)
				a= supercars[i];
		}
		System.out.println(a);
	}
}
