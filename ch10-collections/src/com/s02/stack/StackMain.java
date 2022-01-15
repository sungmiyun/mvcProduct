package com.s02.stack;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		//스택(Stack) : 후입선출 LIFO(Last-In First-Out)방식
		String[] array = {"진달래", "백합", "개나리"	, "벚꽂", "장미"};
		
		Stack<String> st = new Stack<String>();
		
		for(int i = 0; i < array.length; i++) {
			st.push(array[i]);	//객체 저장
		}
		//Stack에 저장된 요소의 목록
		System.out.println(st);
		System.out.println("=============");
		
		while(!st.isEmpty()) {//stack이 비어있는지 검증
			//stack에 저장된 객체를 꺼내서 요소를 반환			
			System.out.print(st.pop() + "\t");
		}
		
		System.out.println();	//줄바꿈
		System.out.println(st);	
		
	}
}
