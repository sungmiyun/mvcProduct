package com.s04.set;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HashSetMain02 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * �ζ� ���α׷� �����
		 * 1 ~ 45 �������� �ߺ����� ���� 6���� ���� HashSet�� �����ϰ� ����ϱ�
		 * ���� ó�� -> Math.random()	: 0.0 ~ 1.0�̸�.. 
		 * 			(int)(Math.random()*45) + 1
		 * HashSet�� ����� �������� ������ üũ -> size()
		 * 
		 */
		
		HashSet<Integer> hs = new HashSet<Integer>();
		while(hs.size() < 6) {
			int num = (int)(Math.random() * 45) + 1;
			//�ߺ����� ������� ����
			hs.add(num);
		}
		
		//Ȯ�� for��
		for(Integer num : hs) {
			System.out.print(num + "\t");
		}
		
		System.out.println("\n====================");
		
		//����
		List<Integer> list = new ArrayList<Integer>(hs);
		Collections.sort(list);
		
		for(int num : list) {
			System.out.print(num + "\t");
		}
		
		
		
	}
}
