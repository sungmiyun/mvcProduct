package com.s05.note;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.s02.preparedstatement.DBConnection;


public class SelectMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBConnection.getConnection();
			
			//sql�� �ۼ�
			sql = "SELECT * FROM note ORDER BY num DESC";
			
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü
			pstmt = conn.prepareStatement(sql);
			
			System.out.println("�۹�ȣ\t����\t�̸�\t�ۼ���");
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ��������� ���ϰ� ��������� ResultSet�� ��Ƽ� ��ȯ
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt("num"));
				System.out.print("\t");
				System.out.print(rs.getString("title"));
				System.out.print("\t");
				System.out.print(rs.getString("name"));
				System.out.print("\t");
				System.out.println(rs.getDate("reg_date"));
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBConnection.executeClose(rs, pstmt, conn);
			
		}
		
		
	}
}
