package com.s02.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC수행 1,2단계
			conn = DBConnection.getConnection();

			
			//SQL문 작성
			sql = "INSERT INTO test2(num, title, name, memo, email, reg_date) "
					+ "VALUES (test2_seq.nextval, ?, ?, ?, ?, SYSDATE)";
			
			//JDBC수행 3단계 : PreparedStatement객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터를 연결
			pstmt.setString(1, "계절은 겨울");//title
			pstmt.setString(2, "s'ab");//name
			pstmt.setString(3, "겨울에 눈이 오지");//memo
			pstmt.setString(4, "test2@test.com");//email
			
			//JDBC수행 4단계 : SQL문 실행
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행을 추가했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBConnection.executeClose(null, pstmt, conn);
		}
		
		
		
	}

}
