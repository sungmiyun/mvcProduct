package com.s03.wrapper;

public class WapperMain02 {
	public static void main(String[] args) {
		//기본 자료형 데이터 -> 참조 자료형 데이터 : auto Boxing
		Integer obj1 = 10;
		Integer obj2 = 20;
		
		//참조 자료형 데이터 -> 기본 자료형 데이터(auto unboxing()
		int result = obj1 + obj2;
		System.out.println(result);;
		
		
		
	}
}
