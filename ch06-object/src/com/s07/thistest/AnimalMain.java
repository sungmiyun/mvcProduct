package com.s07.thistest;

public class AnimalMain {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 인자가 없는 생성자를 이용해서 Animal 객체 생성
		 * set메서드를 이용해서 이름, 나이, 비행여부 저장
		 * 이름, 나이, 비행여부를 출력
		 * 
		 * [출력예시]
		 * 이름 : 기린
		 * 나이 : 12살
		 * 비행여부 : 불가능
		 */
		
		Animal a = new Animal();
		a.setName("기린");
		a.setAge(12);
		a.setFly(false);
		
		System.out.println("이름 : " + a.getName());
		System.out.println("나이 : " + a.getAge() + "살");
		System.out.println("비행여부 : " + printFly(a.isFly()));
		
		System.out.println("============");
		
		//인자가 있는 생성자로 객체 생성
		//이름, 나이, 비행여부 출력
		Animal a1 = new Animal("비둘기", 5, true);
		System.out.println("이름 : " + a1.getName());
		System.out.println("나이 : " + a1.getAge() + "살");
		System.out.println("비행여부 : " + printFly(a1.isFly()));
		
		
	} //end of main
	
	private static String printFly(boolean fly) {
		return fly ? "가능" : "불가능";
	}
	
}
