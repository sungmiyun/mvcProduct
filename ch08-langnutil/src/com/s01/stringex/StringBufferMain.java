package com.s01.stringex;

public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("여름 덥다!");
		System.out.println("1 : " + sb);
		
		//지정한 인덱스에 문자 삽입
		sb.insert(2 , '이');
		System.out.println("2 : " + sb);	
		
		//기존 문자열 뒤에 지정한 문자
		sb.append("가을은 " );
		System.out.println("3 : " + sb);
		
		sb.append("시원하다");
		System.out.println("4 : " + sb);
		
		//시작 index부터 끝 index전까지 지정한 문자열로 대체
		sb.replace(0, 3, "여행가자!!"	);
		System.out.println("5 : " + sb);
		
		//지정한 index의 문자 삭제
		sb.deleteCharAt(0);
		System.out.println("6 : " + sb);
		
		//시작 index부터 끝index 전까지 삭제
		sb.delete(0, 3);
		System.out.println("7 : " + sb);
		
		//StringBuffer -> String
		String str = sb.toString();
		System.out.println("str = " + str);
		
		
	}

}
