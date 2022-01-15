package com.s05.note;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.s02.preparedstatement.DBConnection;

public class DeleteMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("�۹�ȣ : ");
			int num = Integer.parseInt(br.readLine());
			
			//JDBC ���� 1,2�ܰ�
			conn = DBConnection.getConnection();
			
			//SQL�� �ۼ�
			sql = "DELETE FROM note WHERE num = ?";
			
			//JDBC ���� 3�ܰ�
			pstmt = conn.prepareStatement(sql);
			//SQL���� ?�� �����͸� �Ҵ�
			pstmt.setInt(1, num);
			
			//JDBC ���� 4�ܰ�
			int count = pstmt.executeUpdate();
			System.out.println(count + "���� ���� �����߽��ϴ�.");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBConnection.executeClose(null, pstmt, conn);
		}
		
		
		
	}
}
