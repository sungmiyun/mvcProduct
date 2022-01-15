package com.s04.set;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HashSetMain02 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 로또 프로그램 만들기
		 * 1 ~ 45 범위에서 중복되지 않은 6개의 수를 HashSet에 저장하고 출력하기
		 * 난수 처리 -> Math.random()	: 0.0 ~ 1.0미만.. 
		 * 			(int)(Math.random()*45) + 1
		 * HashSet에 저장된 데이터의 갯수를 체크 -> size()
		 * 
		 */
		
		HashSet<Integer> hs = new HashSet<Integer>();
		while(hs.size() < 6) {
			int num = (int)(Math.random() * 45) + 1;
			//중복값을 허용하지 않음
			hs.add(num);
		}
		
		//확장 for문
		for(Integer num : hs) {
			System.out.print(num + "\t");
		}
		
		System.out.println("\n====================");
		
		//정렬
		List<Integer> list = new ArrayList<Integer>(hs);
		Collections.sort(list);
		
		for(int num : list) {
			System.out.print(num + "\t");
		}
		
		
		
	}
}
