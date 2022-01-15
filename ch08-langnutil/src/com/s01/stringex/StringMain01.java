package com.s01.stringex;

public class StringMain01 {

	public static void main(String[] args) {
		//암시적으로 객체 생성
		//암시적으로 String 객체를 생성하면 같은 문자열일때 같은 객체를 공유.
		String str1 = "abc";
		String str2 = "abc";
		
		//객체 비교
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 객체");
		}else {
			System.out.println("str1과 str2는 다른 객체");
		}
		
		//문자열 비교
		if(str1.equals(str2)) {
			System.out.println("str1과 str2의 내용(문자열)이 같다.");
		} else {
			System.out.println("str1과 str2의 내용(문자열)이 다르다.");
		}
		
		System.out.println("===================================");
	
		//명시적으로 객체 생성
		//명시적으로 객체를 생성하면 문자열이 같아도 각각 주소가 부여되고 따로따로 객체가 생성됨
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		//객체비교
		if(str3 == str4 ) {
			System.out.println("str3와 str4는 같은 객체");
		} else {
			System.out.println("str3와 str4는 다른 객체");
		}
		
		//문자열 비교
		if(str3.equals(str4)) {
			System.out.println("str3과 str4의 내용(문자열)이 같다.");
		} else {
			System.out.println("str3과 str4의 내용(문자열)이 다르다.");
		}
		

		System.out.println("===================================");
	
		String str5 = "bus";
		String str6 = "BUS";
		
		//대소문자 구별없이 문자열 비교
		if(str5.equalsIgnoreCase(str6)) {
			System.out.println("대소문자 구별없이 str5와 str의 내용이 같다.");
		} else {
			System.out.println("대소문자 구별없이 str5와 str의 내용이 다르다");
		}
		
	}

}
