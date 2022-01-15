package com.s01.exception;

public class ExceptionMain02 {
	public static void main(String[] args) {
		//예외처리하기
		int[] array = {10, 20, 30};
		for(int i = 0; i <= array.length; i++) {
			//예외처리
			//예외가 발생해도 정상종료될 수 있도록 프로그램적으로 처리하는 것을 말함.
			try {
				//예외가 발생할 가능성이 있는 코드를 명시
				System.out.println("array[" + i + "] : " + array[i]);
					//예외 발생시 생성되는 예외 객체 타입
			}catch(ArrayIndexOutOfBoundsException e) {
				//예외객체에서 제공하는 예외 문구 표시
				e.printStackTrace();
				//System.out.println("없는 인덱스 호출");
			}
		}
		System.out.println("프로그램 끝!");
		
		
	}
}
