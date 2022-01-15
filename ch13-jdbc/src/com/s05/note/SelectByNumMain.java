package com.s05.note;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.s02.preparedstatement.DBConnection;

public class SelectByNumMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("�۹�ȣ : ");
					//String -> Int�� ����
			int num = Integer.parseInt(br.readLine());
			
			//JDBC���� 1,2�ܰ�
			conn = DBConnection.getConnection();
			
			//sql�� �ۼ�
			sql = "SELECT * FROM note WHERE num = ?";
			
			//JDBC���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ �Ҵ�
			pstmt.setInt(1, num);
			
			//JDBC���� 4�ܰ� : SQL���� �����ؼ� 1���� ���� ResultSet�� ��Ƽ� ��ȯ
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("�۹�ȣ : " + rs.getInt("num"));
				System.out.println("�̸� : " + rs.getString("name"));
				System.out.println("��й�ȣ : " + rs.getString("passwd"));
				System.out.println("���� : " + rs.getString("title"));
				System.out.println("���� : " + rs.getString("content"));
				System.out.println("�̸��� : " + rs.getString("email"));
				System.out.println("��¥ : " + rs.getDate("reg_date"));
			}else {//���� ���� ���
				System.out.println("�˻��� ������ �����ϴ�.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBConnection.executeClose(rs, pstmt, conn);
			//BufferedReader �ڿ�����
			if(br!=null) try {br.close();} catch(IOException e) {}
		}
		
		
	}

}
