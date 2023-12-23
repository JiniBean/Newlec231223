package com.newlecture.study.market;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class HistoryRepository {
	
	
	public HistoryList findAll() throws IOException {
		
		HistoryList list = new HistoryList();
		
		FileInputStream stream = new FileInputStream("res/history.csv");
		Scanner scan = new Scanner(stream);
		
		//컬럼 버리기
		if(scan.hasNextLine())
			scan.nextLine();
		
		
		while(scan.hasNextLine()) {
			
			History history = new History();
			
			String line = scan.nextLine();
			String[] tokens = line.split(",");
			
			history.setIdx(Integer.parseInt(tokens[0]));
			history.setName(tokens[1]);
			history.setDate(Integer.parseInt(tokens[2]) );
			history.setAddress(tokens[3]);
		
			list.add(history);
		}
		scan.close();
		stream.close();
		
		return list;
	}
	
	
	public void save(Member member, Product product) throws IOException {
		FileOutputStream stream = new FileOutputStream("res/History.txt", true);
		PrintStream pis = new PrintStream(stream);
		
		History history = new History();
		
		history.setIdx(member.getIdx() );
		history.setName(member.getName() );
		history.setProduct(product.getName() );
		history.setAddress(member.getAddress() );
		
		pis.printf("%d,%s,%s,%d,%s\n", history.getIdx(), history.getName(), history.getProduct(), history.getDate(), history.getAddress() );
		
		pis.close();
		stream.close();
	}



}
