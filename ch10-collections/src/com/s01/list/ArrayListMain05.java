package com.s01.list;

import java.util.ArrayList;


public class ArrayListMain05 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(16);
		
		System.out.println(al);
		System.out.println("============");
		
		//짝수삭제
		//인덱스 0부터 마지막 인덱스까지 반복하면서 조건에 따라 삭제할 경우 인덱스 변경이
		//일어나기 때문에 체크하지 못하고 지나치는 데이터가 발생할 수 있음
		for(int i = 0; i < al.size(); i++) {
			if(al.get(i) % 2 == 0) {
				al.remove(i);
			}
		}
		System.out.println(al);
		System.out.println("=============");
		
		//마지막 인덱스에서 인덱스 0으로 반복문을 수행하면서 특정 조건일 때 데이터를 삭제
		for(int i = al.size() - 1; i >= 0 ; i--) {
			if(al.get(i) % 2 == 0) {
				al.remove(i);
			}
		}
		System.out.println(al);
		
		
	}
}
