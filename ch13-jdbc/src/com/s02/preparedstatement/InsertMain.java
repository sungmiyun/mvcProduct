package com.s02.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC���� 1,2�ܰ�
			conn = DBConnection.getConnection();

			
			//SQL�� �ۼ�
			sql = "INSERT INTO test2(num, title, name, memo, email, reg_date) "
					+ "VALUES (test2_seq.nextval, ?, ?, ?, ?, SYSDATE)";
			
			//JDBC���� 3�ܰ� : PreparedStatement��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� �����͸� ����
			pstmt.setString(1, "������ �ܿ�");//title
			pstmt.setString(2, "s'ab");//name
			pstmt.setString(3, "�ܿ￡ ���� ����");//memo
			pstmt.setString(4, "test2@test.com");//email
			
			//JDBC���� 4�ܰ� : SQL�� ����
			int count = pstmt.executeUpdate();
			System.out.println(count + "���� ���� �߰��߽��ϴ�.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBConnection.executeClose(null, pstmt, conn);
		}
		
		
		
	}

}
