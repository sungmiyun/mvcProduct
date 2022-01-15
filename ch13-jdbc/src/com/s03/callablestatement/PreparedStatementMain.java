package com.s03.callablestatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.s02.preparedstatement.DBConnection;

public class PreparedStatementMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		String name = "Lee"; //ȸ�� �̸�
		 int pay = 2500; //�λ�� �޿�
		 
		 try {
			
			 //JDBC���� 1,2�ܰ�
			 conn = DBConnection.getConnection();
			 //SQL�� �ۼ�
			 sql = "UPDATE salary SET pay = ? WHERE name = ?";
			 //JDBC���� 3�ܰ�
			 pstmt = conn.prepareStatement(sql);
			 //SQL���� ?�� ������ �Ҵ�
			 pstmt.setInt(1, pay);
			 pstmt.setString(2, name);
			 //JDBC���� 4�ܰ�
			 int count = pstmt.executeUpdate();
			 System.out.println(count + "���� ���� �����߽��ϴ�.");
			 
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ڿ�����
			DBConnection.executeClose(null, pstmt, conn);
		}
		
		
	}

}
