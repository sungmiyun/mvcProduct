package com.s03.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.s02.preparedstatement.DBConnection;

public class CallableStatementMain {
	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement cstmt = null;
		String sql = null;
		
		String name = "Kim";
		float rate = 0.03f;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBConnection.getConnection();
			
			//SQL�� �ۼ�
			sql = "{call adjust(?,?)";
			
			//JDBC���� 3�ܰ� : CallableStatement ��ü ����
			cstmt = conn.prepareCall(sql);
			//?�� ������ ����
			cstmt.setString(1, name); //n
			cstmt.setFloat(2, rate); //rate
			
			//JDBC���� 4�ܰ� : ���ν��� ȣ��
			cstmt.executeUpdate();
			System.out.println("�޿� ������ �����߽��ϴ�.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			if(cstmt != null) try {cstmt.close();} catch(SQLException e) {}
			if(conn != null) try {conn.close();} catch(SQLException e) {}
		}
		
		
	}
}
