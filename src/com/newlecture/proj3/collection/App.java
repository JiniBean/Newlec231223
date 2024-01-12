package com.newlecture.proj3.collection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
	public static void main(String[] args) throws IOException {
		{
			
//			ObjectList list = new ObjectList();
//			list.add("안녕");
//			list.add(3);
//			
//			GList<Menu> list1 = new GList<Menu>();
//			
//			list1.add(new Menu());
//			MenuUI menuUI = new MenuUI();
//			
//			
//			menuUI.index();
		}
		{
			Set<Integer> set = new HashSet<>();
			
			set.add(1);
			set.add(2);
			set.add(1);
			set.add(3);
//			System.out.println(set.size());
			
//			Iterator it = set.iterator();
			
//			while (it.hasNext())
//				System.out.println(it.next());
			
			for(Integer n : set) //자동 언박싱 과정이 일어남
				System.out.println("이터레이터: "+ n);
			
			int[] m = {0,1,2,3,4,5};
			for(int i : m)
				System.out.println("배열"+ i);
			
			char[] c = {'a', 'b','c'};
			for(char a :c)
				System.out.println("캐릭터 배열" + a);
		}
	
		{
			List<Integer> list = new ArrayList<>();
			
			list.add(1);
			list.add(3);
			list.add(4);
			list.add(1);
//			System.out.println(list.size());
			
			Iterator it = list.iterator();
			
			while (it.hasNext())
				System.out.println(it.next());
			
		}
		
		{
			Map<Integer, String> map = new HashMap<>();
			map.put(1, "안녕 ");
			map.put(2, "나는 은진이야");
			
			System.out.println(map.get(1)+ map.get(2));
			

		}
		
		
	}
	
}
