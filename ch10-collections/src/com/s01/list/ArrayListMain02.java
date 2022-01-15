package com.s01.list;

import java.util.ArrayList;

public class ArrayListMain02 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("강호동");		//String -> Object
		al.add("박명수");		//String -> Object
		al.add("유재석");		//String -> Object
		al.add("김구라");		//String -> Object
		
		//반복문을 이용해서 저장된 요소 출력
		for(int i = 0; i < al.size(); i++) {
			String name = (String)al.get(i);
			System.out.println(name);
		}
		
	}
}
