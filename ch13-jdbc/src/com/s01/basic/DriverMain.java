package com.s01.basic;

public class DriverMain {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̹��� ���������� ��ġ�Ǿ����ϴ�.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}

}
