package com.s02.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class UpdateMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBConnection.getConnection();
			
			//SQL문 실행
			sql = "UPDATE test2 SET title = ?, name = ?, memo = ?, email = ? WHERE num = ?";
		
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 연결
			pstmt.setString(1, "여기는 강남"); //title
			pstmt.setString(2, "강호동"); //name
			pstmt.setString(3, "지금은 14시"); //memo 
			pstmt.setString(4, "sample@sample.com"); //email
			pstmt.setInt(5, 1); //num
			
			//JDBC 수행 4단계 : SQL문 실행
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행의 정보를 수정했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBConnection.executeClose(null, pstmt, conn);
		}
		
	}
}
