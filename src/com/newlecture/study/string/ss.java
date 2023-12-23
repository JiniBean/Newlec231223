package com.newlecture.study.string;

import java.util.Scanner;

public class ss {
	public static void main(String[] args) {
	    int i=1;
	      System.out.println(++i + i + 2 -1 + i++ - --i - i);
	      System.out.println(i);
	      
//	      int i=0;
//          System.out.println(i+ i++ + ++i/i%2 + (++i/3) + i++ - ++i/i--);
//
//          System.out.println(i);
	      
	      boolean isRun = true;
	      while(isRun) {
	    	  
	    	  Scanner scan = new Scanner(System.in);
	    	  
	    	  System.out.println("재도전 하시겠습니까? (게임을 종료하시려면 1을, 다시 시작하시려면 아무 키나 눌러주세요");
	    	  
	    	  String run = scan.nextLine();
	    	  if(run.equals("1")) {
	    		  
//	    		  isRun = false;
	    		  System.out.println("게임이 종료되었습니다.");
	    		  break;
	    	  }
	    	  
	      }
	}
}
