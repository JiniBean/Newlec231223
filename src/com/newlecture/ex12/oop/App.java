package com.newlecture.ex12.oop;

import java.io.FileNotFoundException;

public class App {
	public static void main(String[] args) throws FileNotFoundException {
		
		Board board = new Board(); // ()가 함수= 생성자= 갓생성한 객체만 호출할 수 있는 특이한 애
		board.deco();
		board.pirnt();
		
		int count = 0;
		boolean run = true;
		while(run) {
			board.putStone(count);
			board.pirnt();
			
			count++;
		}
		board.save(run);
	}

}