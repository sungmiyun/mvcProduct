package com.s03.statictest;

public class StaticMain {
	
	//static ���� Ŭ����
	//static ������ static �޼��带 ������ ���ιɷ����� �ݵ��
	//static ���� Ŭ������ �����ؾ���
	public static class Inner{
		int iv = 300;
		static int cv = 400;
		static void make() {
			System.out.println("g�����Ϥ���");
		}
	}
	
	public static void main(String[] args) {
		//static ���� Ŭ���� ��ü ����
		StaticMain.Inner i = new StaticMain.Inner();
		System.out.println(i.iv);
		
		//static���� ȣ��
		System.out.println(StaticMain.Inner.cv);
		
		//static �޼��� ȣ��
		StaticMain.Inner.make();
		
	}

}
