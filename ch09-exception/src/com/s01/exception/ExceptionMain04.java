package com.s01.exception;

public class ExceptionMain04 {
	public static void main(String[] args) {
		//try ~ catch ~ finally
		//finally 블럭은 예외가 발생하든 발생하지 않든 finally 블럭이 실행됨
		//DataBase 연동 또는 입력, file 실행 시 자원을 정리해야할 때 finally 블럭에서 처리함
		System.out.println("====예외가 발생하지 않을 때====");
		try {
			System.out.println("1");
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		
		System.out.println("프로그램 종료~");
		
		System.out.println("=============");
		System.out.println("====예외가 발생할 때====");
		try {
			System.out.println("1");
			System.out.println(10/0);
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		
		System.out.println("프로그램 종료~");
		
	}
}
