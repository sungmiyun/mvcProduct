package com.s02.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class UpdateMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBConnection.getConnection();
			
			//SQL�� ����
			sql = "UPDATE test2 SET title = ?, name = ?, memo = ?, email = ? WHERE num = ?";
		
			//JDBC ���� 3�ܰ�
			pstmt = conn.prepareStatement(sql);
			
			//?�� ������ ����
			pstmt.setString(1, "����� ����"); //title
			pstmt.setString(2, "��ȣ��"); //name
			pstmt.setString(3, "������ 14��"); //memo 
			pstmt.setString(4, "sample@sample.com"); //email
			pstmt.setInt(5, 1); //num
			
			//JDBC ���� 4�ܰ� : SQL�� ����
			int count = pstmt.executeUpdate();
			System.out.println(count + "�� ���� ������ �����߽��ϴ�.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBConnection.executeClose(null, pstmt, conn);
		}
		
	}
}
