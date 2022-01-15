package com.s04.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {
	public static void main(String[] args) {
		String[] array = {"Java", "JSP", "Java", "Android"};
		
		HashSet<String> hs = new HashSet<String>();
		for(String n : array) {
			hs.add(n); //객체 저장, 중복 불허
		}
		
		//HashSet에 저장된 요소의 목록
		System.out.println(hs);
		
		Iterator<String> ir = hs.iterator();
		//저장된 요소가 있는지 검증
		while(ir.hasNext()) {
			//저장된 요소 반환
			System.out.println(ir.next());
		}
		
		System.out.println("====================");
		
		//확장 for문
		for(String s : hs) {
			System.out.println(s);
		}
		
		
	}
}
