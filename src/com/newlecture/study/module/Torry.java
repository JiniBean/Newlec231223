package com.newlecture.study.module;

public class Torry {
	
	public static void main(String[] args) {
		
//		Cat torry = new Cat();
//		
//		torry.name = "토리";
//		
//		System.out.printf("이름 : %s\n나이: %d살\n색 : %s", torry.name, torry.age, torry.color);
//		
//		Cat[] cats = new Cat[3];
//		System.out.println(cats[0].age);
		
//		Cat cat1 = new Cat();
//	       cat1.age = 1;
//
//
//	       Cat cat2 = new Cat();
//	       cat2.age = 3;
//
//
//	       Cat cat3 = null;
//	      
//	       cat2 = cat3;
//
//
//	       if(cat1 != null) {
//	           System.out.println(cat1.age);
//	       }
//
//
//	       if(cat2 != null) {
//	           System.out.println(cat2.age);
//	       }

		Cat[] cat = new Cat[3];
		for(int i=0; i<3; i++) {
			Cat cats = new Cat();
			 cats.age = i+1;
			 cat[i] = cats;
			 cats =null;
		
		}
		for(int i=0; i<3; i++)
			System.out.println(cat[i].age);
	}
}
