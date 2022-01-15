package com.s01.list;

import java.util.ArrayList;

public class ArrayListMain04 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("서울");
		al.add("부산");
		al.add("광주");
		al.add("대구");
		al.add("인천");
		
		//반복문을 이용한 요소의 출력
		for(int i = 0; i < al.size(); i++) {
			System.out.println(i + " : " + al.get(i));
		}
		
		System.out.println("=======================");
		
		//요소의 삭제
		//al.remove(2);	//인덱스 2 삭제
		al.remove("부산"); //요소 삭제 
		for(int i = 0; i < al.size(); i++) {
			System.out.println(i + " : " + al.get(i));
		}
	}
}
