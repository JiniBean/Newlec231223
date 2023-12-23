package com.newlecture.study.loop;

public class PigeonTable2 {
	public static void main(String[] args) {
		
		for(int i=0, n=1 ; i<9 ; i++, n++) {
			
			for( int ii=0,  t=1 ; ii<9 ; ii++, t++) {
				
				int result = n*t;
				System.out.printf("\n%d X %d = %d", n, t, result);
			}
			System.out.println();
		}
	}
}
