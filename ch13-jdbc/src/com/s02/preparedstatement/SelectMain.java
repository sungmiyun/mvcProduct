package com.s02.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class SelectMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBConnection.getConnection();
			
			//SQL�� �ۼ�
			sql = "SELECT * FROM test2 ORDER BY num DESC";
			
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ��������� ResultSet�� �����ϰ� ResultSet��ü ��ȯ
			rs = pstmt.executeQuery();
			System.out.println("��ȣ\t����\t�ۼ���\t�̸���\t��¥\t����");
			
			while(rs.next()) {
				System.out.print(rs.getInt("num"));
				System.out.print("\t");
				System.out.print(rs.getString("title"));
				System.out.print("\t");
				System.out.print(rs.getString("name"));
				System.out.print("\t");
				System.out.print(rs.getString("email"));
				System.out.print("\t");
				System.out.print(rs.getDate("reg_date"));
				System.out.print("\t");
				System.out.println(rs.getString("memo"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			//�ڿ�����
			DBConnection.executeClose(rs, pstmt, conn);
			
		}
		
		
		
		
	}
}
