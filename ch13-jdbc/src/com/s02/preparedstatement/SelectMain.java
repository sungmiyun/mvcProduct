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
			//JDBC 수행 1,2단계
			conn = DBConnection.getConnection();
			
			//SQL문 작성
			sql = "SELECT * FROM test2 ORDER BY num DESC";
			
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//JDBC 수행 4단계 : SQL문을 실행해서 결과집합은 ResultSet에 보관하고 ResultSet객체 반환
			rs = pstmt.executeQuery();
			System.out.println("번호\t제목\t작성자\t이메일\t날짜\t내용");
			
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
			//자원정리
			DBConnection.executeClose(rs, pstmt, conn);
			
		}
		
		
		
		
	}
}
