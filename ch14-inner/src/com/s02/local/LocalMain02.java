package com.s02.local;

public class LocalMain02 {
	public void innerTest() {
		int a = 100; //지역변수
	
		//로컬 내부 클래스
		class Inner{
			public void getData() {
				/*
				 * JDK8.0부터는 내부클래스가 포함된 메서드의 지역변수를 
				 * 내부 클래스에서 호출하면 자동으로 상수로 변환
				 */
				//a = 200; => 상수로 변환되어 값을 변경할 수 없음
				System.out.println("a : " + a);
			}
		}
		Inner i = new Inner();
		i.getData();	
	}
	
	public static void main(String[] args) {
		LocalMain02 m = new LocalMain02();
		m.innerTest();
		
	}
}
