package com.newlecture.study.market;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class MemberRepository {

	
	public MemberList findAll() throws IOException {
		FileInputStream stream = new FileInputStream("res/member.txt");
		Scanner scan = new Scanner(stream);
		
		MemberList list = new MemberList();
		
		//컬럼 버리기
		if(scan.hasNextLine())
			scan.nextLine();
		
		
		while(scan.hasNextLine()) {
			
			Member member = new Member();
			
			String line = scan.nextLine();
			String[] tokens = line.split(",");
			
			member.setIdx(Integer.parseInt(tokens[0]) );
			member.setName(tokens[1]);
			member.setId(tokens[2]);
			member.setPassword(tokens[3]);
			member.setPhone(Integer.parseInt(tokens[4]) );
			member.setAddress(tokens[5]);
			member.setEmail(tokens[6]);
		
			list.add(member);
		}
		scan.close();
		stream.close();
		
		return list;
	}
	
	
	public void save(Member member) throws IOException {
		FileOutputStream stream = new FileOutputStream("res/Member.txt", true);
		PrintStream pis = new PrintStream(stream);
		
		pis.printf("\n%s,%s,%d,%s,%s", member.getId(), member.getPassword(), member.getPhone(), member.getAddress(), member.getEmail() );
		
		pis.close();
		stream.close();
	}


	public boolean find(Member member) throws IOException {
		FileInputStream stream = new FileInputStream("res/member.txt");
		Scanner scan = new Scanner(stream);
		
		MemberList list = new MemberList();
		boolean isRight = false;
		
		//컬럼 버리기
		if(scan.hasNextLine())
			scan.nextLine();
		
		
		while(scan.hasNextLine()) {
			
			Member temp = new Member();
			
			String line = scan.nextLine();
			String[] tokens = line.split(",");
			
			temp.setId(tokens[2]);
//			temp.setPassword(tokens[3]);
			
			if( (member.getId() == temp.getId() ) ) {
				
				isRight = true;
				break;
			}
			
		}
		scan.close();
		stream.close();
		
		return isRight;
	}		
}
