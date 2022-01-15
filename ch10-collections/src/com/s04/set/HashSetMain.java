package com.s04.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {
	public static void main(String[] args) {
		String[] array = {"Java", "JSP", "Java", "Android"};
		
		HashSet<String> hs = new HashSet<String>();
		for(String n : array) {
			hs.add(n); //��ü ����, �ߺ� ����
		}
		
		//HashSet�� ����� ����� ���
		System.out.println(hs);
		
		Iterator<String> ir = hs.iterator();
		//����� ��Ұ� �ִ��� ����
		while(ir.hasNext()) {
			//����� ��� ��ȯ
			System.out.println(ir.next());
		}
		
		System.out.println("====================");
		
		//Ȯ�� for��
		for(String s : hs) {
			System.out.println(s);
		}
		
		
	}
}
