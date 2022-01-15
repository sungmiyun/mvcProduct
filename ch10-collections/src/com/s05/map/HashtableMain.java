package com.s05.map;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableMain {
	public static void main(String[] args) {
		Hashtable<String, String> h = new Hashtable<String, String>();
		h.put("name", "홍길동");
		h.put("age", "27");
		h.put("job", "경찰");
		h.put("address", "서울시");
		h.put("hobby", "영화감상");
		
		//key가 중복되면 마지막에 입력된 value가 인정
		h.put("job", "의사");
		
		//key와 value에 null을 허용하지 않음
		//h.put("특기", null);
		//h.put(null, "여행");
		
		
		//Hashtable에 저장된 key, value 목록
		System.out.println(h);
		System.out.println("---------------------------");
		
		String name = h.get("name");
		System.out.println("이름은 " + name);
		System.out.println("----------------------------");
		
		Enumeration<String> en = h.keys();
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			System.out.println(key + ", " + h.get(key));
		}
		
		
	}
}
