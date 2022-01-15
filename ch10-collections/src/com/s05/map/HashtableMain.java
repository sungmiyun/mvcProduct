package com.s05.map;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableMain {
	public static void main(String[] args) {
		Hashtable<String, String> h = new Hashtable<String, String>();
		h.put("name", "ȫ�浿");
		h.put("age", "27");
		h.put("job", "����");
		h.put("address", "�����");
		h.put("hobby", "��ȭ����");
		
		//key�� �ߺ��Ǹ� �������� �Էµ� value�� ����
		h.put("job", "�ǻ�");
		
		//key�� value�� null�� ������� ����
		//h.put("Ư��", null);
		//h.put(null, "����");
		
		
		//Hashtable�� ����� key, value ���
		System.out.println(h);
		System.out.println("---------------------------");
		
		String name = h.get("name");
		System.out.println("�̸��� " + name);
		System.out.println("----------------------------");
		
		Enumeration<String> en = h.keys();
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			System.out.println(key + ", " + h.get(key));
		}
		
		
	}
}
