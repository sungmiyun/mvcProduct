package com.s05.note;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.s02.preparedstatement.DBConnection;

public class UpdateMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("�۹�ȣ : ");
							//String -> Int
			int num = Integer.parseInt(br.readLine());
			System.out.print("�̸� : ");
			String name = br.readLine();
			System.out.print("��й�ȣ : ");
			String passwd = br.readLine();
			System.out.print("���� : ");
			String title = br.readLine();
			System.out.print("���� : ");
			String content = br.readLine();
			System.out.print("�̸��� : ");
			String email = br.readLine();
			
			//JDBC ���� 1,2 �ܰ�
			conn = DBConnection.getConnection();
			
			//SQL�� �ۼ�
			sql = "UPDATE note SET name = ?, passwd = ?, title = ?, "
					+ "content =?, email = ? WHERE num = ? ";
			
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//SQL���� ?�� ������ �Ҵ�
			pstmt.setString(1, name);
			pstmt.setString(2, passwd);
			pstmt.setString(3, title);
			pstmt.setString(4, content);
			pstmt.setString(5, email);
			pstmt.setInt(6, num);
			
			//JDBC ���� 4�ܰ� : SQL�� ����
			int count = pstmt.executeUpdate();
			System.out.println(count + "���� ���� �����߽��ϴ�.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBConnection.executeClose(null, pstmt, conn);
			if(br!= null) try {br.close();} catch(IOException e) {}
		}
		
	}

}
