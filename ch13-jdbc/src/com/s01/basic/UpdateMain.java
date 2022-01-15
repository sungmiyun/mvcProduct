package com.s01.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateMain {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "scott";
		String db_password = "tiger";
		
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		
		try {
			//JDBC ���� 1�ܰ� : ����̹� �ε�
			Class.forName(db_driver);
			
			//JDBC ���� 2�ܰ� : Connection ��ü ����(ID, ��й�ȣ ����)
			conn = DriverManager.getConnection(db_url, db_id, db_password);
			
			//SQL�� �ۼ�
			sql = "UPDATE test1 SET age = 90 WHERE id = 'sky'";
			
			//JDBC ���� 3�ܰ� : Statement ��ü ����
			stmt = conn.createStatement();
			
			//JDBC ���� 4�ܰ� : SQL�� ����
			//update���� �����ؼ� ���̺��� ���� �����ϰ� ������ ���� ������ ��ȯ
			int count = stmt.executeUpdate(sql);
			System.out.println(count + "�� ���� ������ �����߽��ϴ�.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			//�ڿ�����
			if(stmt != null) try {stmt.close();} catch(SQLException e) {}
			if(conn != null) try {conn.close();} catch(SQLException e) {}
		}
		
		
		
		
	}
}
