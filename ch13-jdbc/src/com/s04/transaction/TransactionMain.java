package com.s04.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.s02.preparedstatement.DBConnection;

public class TransactionMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		String sql = null;
		
		try {
			//JDBC���� 1,2 �ܰ�
			conn = DBConnection.getConnection();
			
			//Ʈ����� ó���� ���ؼ� auto commit ����
			conn.setAutoCommit(false);
			
			//SQL�� �ۼ�
			sql = "INSERT INTO test1 VALUES('Koera', 100)";
			pstmt1 = conn.prepareStatement(sql);
			pstmt1.executeUpdate();
			
			sql = "INSERT INTO test1 VALUES ('England', 200)";
			pstmt2 = conn.prepareStatement(sql);
			pstmt2.executeUpdate();
			
			//test������ ������ �ִ� SQL�� �ۼ�
			sql = "INSERT INTO test1 VALUES ('China', 300";
			pstmt3 = conn.prepareStatement(sql);
			pstmt3.executeUpdate();
			
			//���������� �۾��� �Ϸ�Ǹ� commit
			conn.commit();
			System.out.println("�۾� �Ϸ�!!");
			
			
		}catch(Exception e) {
			e.printStackTrace();
			//���ܰ� �߻��ϸ� rollback
			try {
				conn.rollback();
			}catch(SQLException es) {
				es.printStackTrace();
			}
		}finally {
			//�ڿ�����
			DBConnection.executeClose(null, pstmt3, null);
			DBConnection.executeClose(null, pstmt2, null);
			DBConnection.executeClose(null, pstmt1, conn);
		}
		
	}
}
