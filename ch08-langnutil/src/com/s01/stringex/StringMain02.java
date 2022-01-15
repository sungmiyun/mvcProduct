package com.s01.stringex;

public class StringMain02 {

	public static void main(String[] args) {
		
		String s1 = "kwon Sun ae";
					//012345678910 , 문자열 길이 = 11
		
		int index = s1.indexOf('n');
		System.out.println("맨 처음 문자 n의 위치 : " + index);
		
		index = s1.indexOf("Sun");
		System.out.println("문자열 Sun의 위치 : " + index);

		index = s1.lastIndexOf('n');
		System.out.println("마지막 문자 n의 위치 : " + index);
		
		char c = s1.charAt(7); //문자 추출
		System.out.println("추출한 문자 : " + c);
		
		index = s1.indexOf('S');
		//index 5부터 마지막 index까지 문자열 추출
		String str = s1.substring(index);
		System.out.println("대문자 S부터 끝까지 잘라내기 : " + str);
		
		//시작 index부터 끝 index 전까지 문자열 추출
		str = s1.substring(index, index + 3); // 5, 8
		System.out.println("대문자 S로부터 3자까지 잘라내기 : " + str);
		
		int length = s1.length();
		System.out.println("s1의 길이 : " + length);
		
		String[] array = s1.split(" ");
		for(int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] : " + array[i]);
		}
		
		
		
	}

}
