package com.s01.list;

import java.util.ArrayList;

class A{
	@Override
	public String toString() {
		return "A";
	}
}

class B{}

public class ArrayListMain01 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new A()); // A -> Object
		al.add(new B()); // B -> Object
		al.add("ȫ�浿"); // String -> Object
		al.add(100); //Integer -> Object
		
		//ArrayList�� ����� ����� ���
		System.out.println(al);
		
		
	}
}
