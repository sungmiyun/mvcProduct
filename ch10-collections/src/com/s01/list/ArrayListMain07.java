package com.s01.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain07 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * �ζ� ���α׷� �����
		 * 1 ~ 45 �������� �ߺ����� ���� 6���� ���� ArrayList�� �����ϰ� ����ϱ�
		 * ���� ó�� -> Math.random()	: 0.0 ~ 1.0�̸�.. 
		 * 			(int)(Math.random()*45) + 1
		 * ArrayList�� ����� �������� ������ üũ -> size()
		 * �ߺ��� üũ contains()
		 */
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while(al.size() < 6) {
			int num = (int)(Math.random()*45) + 1;
			
			//�ߺ��� üũ
			if(!al.contains(num)) {
				al.add(num);
			}
		}
		
		System.out.println(al);
		System.out.println("===============");
		//����
		Collections.sort(al);
		for(int num : al) {
			System.out.print(num + "\t");
		}
		
		
	}
}
