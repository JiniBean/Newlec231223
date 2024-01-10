package com.newlecture.proj3.collection;


public class App4Thread {
	public static void main(String[] args) {
		
		new Thread( () -> { //람다
			download();//시작하는 코드
		}).start();//start 안해주면 아무것도 안됨
		
		download();
		System.out.println("프로그램 종료");
//		download();
	}

	private static void download() {
		
		long threadID = Thread.currentThread().getId();
		
		for(int i=0; i<100; i++) {
			System.out.printf("[%d] : %d",threadID, i+1);
			System.out.println();
		}
	}
	
}
