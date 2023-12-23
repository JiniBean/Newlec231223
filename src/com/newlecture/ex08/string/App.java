package com.newlecture.ex08.string;

public class App {
	public static void main(String[] args) {
		String name1 = "아이유";//실행환경에서 자동으로 만들어진 객체
		String name2 = "아이유";
		String name3 = new String("아이유");//내가 직접 만든 객체
		
		System.out.println(name1==name2&& name2=="아이유");//참조하는 객체가 같음
		System.out.println(name2==name3); //자동 객체 != 내가 만든 객체
		System.out.println("아이유"==name3);//자동 객체 != 내가 만든 객체
		System.out.println(name1.equals(name3));//객체 안의 문자열이 같음
		
		String fileName = "photoz.jpg";
		name1 = fileName.substring(0,3);
//		name2 = fileName.length();
		
		System.out.println(fileName.length() );
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.indexOf(0));
		System.out.println(fileName.substring(0,3));//0에서부터 3개 뽑아라
		System.out.println(name1);
		
		System.out.println(fileName.substring(0,fileName.indexOf(".")) );//.앞에까지 뽑아라
		
		int endIndex = fileName.indexOf("z");
		
		System.out.println( (endIndex==-1?"없음":endIndex));
		//쌉천재 굿 ~
		
		int idx = fileName.indexOf("z");
		System.out.println();
		String m = (idx==-1)?"없음":String.valueOf(idx);
		System.out.println(m);
		
		System.out.println("abcdef".charAt(0));

		int[] arr = {0,1};
		int a = 0;
		
		System.out.println(arr[0]==a);
		
		
	}
}
