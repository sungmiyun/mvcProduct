package com.s02.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		
		try {
			//JDBC 수행 1,2단계
			conn = DBConnection.getConnection();
			
			//SQL문 작성
			sql = "DELETE FROM test2 WHERE num = ?";
			
			//JDBC 수행 3단계 :PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 연결
			pstmt.setInt(1, 1); //num
			
			//JDBC 수행 4단계 
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 삭제했습니다.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBConnection.executeClose(null, pstmt, conn);
		}
		
	}
}
