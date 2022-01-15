package com.s02.overloading;

public class OverloadingMain {
	/*
	 * Method Overloading(�ߺ� ����)�̶�� ���� �ϳ��� Ŭ���� ������ 
	 * ���� �̸��� ������ �޼��尡 ������ ���ǵǴ� ���� ���Ѵ�.
	 * ������ Ÿ�� �Ǵ� ����, ��ġ�� ������ �ٸ� ��� �ٸ� �޼���� �ν���.
	 */
	public void print(int n) {
		System.out.println("���� n = " + n);
	}
	
	public void print(double n) {
		System.out.println("�Ǽ� n = " + n);
	}
	
	public void print(double n, long a) {
		System.out.println("�Ǽ� n = " + n + ",���� a = " + a);
	}
	
	public void print(long a, double n) {
		System.out.println("���� a = " + a + ",�Ǽ� n = " + n);
	}
	
	public static void main(String[] args) {
		OverloadingMain om = new OverloadingMain();
		om.print(20);
		om.print(5.6);	
		om.print(3.7, 1234L);
		om.print(1234L, 3.7);
		
	}
}
