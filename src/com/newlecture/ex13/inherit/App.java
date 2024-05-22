package com.newlecture.ex13.inherit;

import java.io.FileNotFoundException;

public class App {
	public static void main(String[] args) throws FileNotFoundException {
		
		Board board = new Board(); // ()가 함수= 생성자= 갓생성한 객체만 호출할 수 있는 특이한 애
		board.deco();
		board.pirnt();
		
		int count = 0;
		boolean run = true;
		while(run) {
			//오목 입력받기
			Omok omok = new Omok();
			omok.input(count);
			
			//보드에 오목 두기
			board.put(omok);
			
			//보드 출력하기
			board.pirnt();
			
			board.save(run);
			count++;
		}
	}

}