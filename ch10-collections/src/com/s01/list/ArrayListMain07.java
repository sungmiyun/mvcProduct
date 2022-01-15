package com.s01.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain07 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 로또 프로그램 만들기
		 * 1 ~ 45 범위에서 중복되지 않은 6개의 수를 ArrayList에 저장하고 출력하기
		 * 난수 처리 -> Math.random()	: 0.0 ~ 1.0미만.. 
		 * 			(int)(Math.random()*45) + 1
		 * ArrayList에 저장된 데이터의 갯수를 체크 -> size()
		 * 중복값 체크 contains()
		 */
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while(al.size() < 6) {
			int num = (int)(Math.random()*45) + 1;
			
			//중복값 체크
			if(!al.contains(num)) {
				al.add(num);
			}
		}
		
		System.out.println(al);
		System.out.println("===============");
		//정렬
		Collections.sort(al);
		for(int num : al) {
			System.out.print(num + "\t");
		}
		
		
	}
}
