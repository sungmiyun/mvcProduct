package com.s01.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMain {
	public static void main(String[] args) {
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "scott";
		String db_password = "tiger";
		try {
			//JDBC ���� 1�ܰ� : ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			
			//JDBC ���� 2�ܰ� : Connection��ü ����(ID, ��й�ȣ ����) => �α���
			Connection conn = DriverManager.getConnection(db_url, db_id, db_password);
			System.out.println("Connection ��ü�� �����Ǿ����ϴ�.");
	
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
