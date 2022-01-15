package com.s02.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBConnection.getConnection();
			
			//SQL�� �ۼ�
			sql = "DELETE FROM test2 WHERE num = ?";
			
			//JDBC ���� 3�ܰ� :PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ����
			pstmt.setInt(1, 1); //num
			
			//JDBC ���� 4�ܰ� 
			int count = pstmt.executeUpdate();
			System.out.println(count + "�� ���� �����߽��ϴ�.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBConnection.executeClose(null, pstmt, conn);
		}
		
	}
}
