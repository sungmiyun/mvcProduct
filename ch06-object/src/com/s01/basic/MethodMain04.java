package com.s01.basic;

public class MethodMain04 {

	//인자 전말 방식 : Variable Arguments
	//자료형이 일치할 때 전달하고자 하는 값의 갯수를 다르게 지정할 수 있다.
	//전달되는 데이터는 내부적으로 배열로 인식한다.
	public void argTest(int ...n) {
		for(int i = 0; i < n.length; i++){
			System.out.println("n[" + i + "] : " + n[i]);
		}
		System.out.println("================");
	}
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		MethodMain04 m = new MethodMain04();
		m.argTest();
		m.argTest(10,20);
		m.argTest(1,2,3,4,5,6,7,8,9,10);
		
		
	}

}
