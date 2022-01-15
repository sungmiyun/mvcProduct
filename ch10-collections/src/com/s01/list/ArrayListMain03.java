package com.s01.list;

import java.util.ArrayList;


public class ArrayListMain03 {
	public static void main(String[] args) {
		/*
		 * 제네릭 표현 : 객체를 생성할 때 객체에 저장할 수 있는 요소의 타입을 지정
		 */
		//String으로 지정해서 저장되는 객체의 자료형은 String만 인정,
		//다른 타입의 객체를 저장하면 오류 발생
		ArrayList<String> al = new ArrayList<String>();
		al.add("강호동");		//String -> Object
		al.add("김구라");		//String -> Object
		//al.add(1000);		//Inter -> Object
		al.add("박명수");		//String -> Object
		
		//반복문을 이용해서 저장된 요소 출력
		for(int i = 0; i < al.size(); i++) {
			String name = al.get(i);
			System.out.println(name);
		}
		System.out.println("==============");
		//확장 for문을 이용한 요소의 출력
	}
}