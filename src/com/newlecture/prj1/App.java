package com.newlecture.prj1;


public class App {
	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int avg;
		int total;
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;//성적입력

		total = kor1 + kor2 + kor3;
		avg =  total/3;
		
		System.out.println( avg>80 ? "훌륭하군요" : "노력하세요" );
		
		
		System.out.printf("total : ", total);
		System.out.printf("avg : ", avg);//평균값 출력
		
		short b1 = 0xB6;
		byte b2 = 0x62;
		byte b3 = 0x0B;
		byte b4 = 0x00;
		
//		(int) b1 << 0;  00000000 00000000 00000000 10110110
//		(int) b2 << 8;  00000000 00000000 01100010 00000000
//		(int) b3 << 16; 00000000 00001011 00000000 00000000
//		(int) b4 << 24; 00000000 00000000 00000000 00000000
		
		int size = (int) b1 << 0
					| (int) b2 << 8
					| (int) b3 << 16
					| (int) b4 << 24;
		System.out.println(size); //746166
	
		
	
		
	}
}