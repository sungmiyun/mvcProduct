package kr.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.member.vo.MemberVO;

public class MemberDAO {
	//JDBC수행 1,2단계를 수행하고 Connection 객체를 반환
	private Connection getConnection() throws Exception{
		String driverName = "oracle.jdbc.OracleDriver";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "scott";
		String dbPass = "tiger";

		//JDBC수행 1단계
		Class.forName(driverName);
		//JDBC수행 2단계
		Connection conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);
		return conn;
	}
	//자원정리
	private void executeClose(ResultSet rs,
			PreparedStatement pstmt,
			Connection conn) {
		if(rs != null) try {rs.close();} catch(SQLException e) {}
		if(pstmt != null) try {pstmt.close();} catch(SQLException e) {}
		if(conn != null)try {conn.close();}catch(SQLException e) {}		
	}

	//회원가입
	public void insertMember(MemberVO member) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//Connection 객체 생성
			conn = getConnection();
			//SQL문 작성
			sql = "INSERT INTO zmember (num, id, name, passwd, phone, email, address, reg_date) VALUES (zmember_seq.nextval, ?, ?, ?, ?, ?, ?, SYSDATE)";
			
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getPasswd());
			pstmt.setString(4, member.getPhone());
			pstmt.setString(5, member.getEmail());	
			pstmt.setString(6, member.getAddress());
			
			//SQL문 실행
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			throw new Exception (e);
		}finally {
			//자원정리
			executeClose(null, pstmt, conn);
		}
		
	}
	
	//ID 중복 체크 및 로그인 처리
	public MemberVO checkMember(String id) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVO member = null;
		String sql = null;
		
		try {
			//Connection 객체 생성
			conn = getConnection();
			//SQL문 작성
			sql = "SELECT * FROM zmember WHERE id = ?";
			//preparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, id);
			//SQL문 실행
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				//자바빈 객체 생성
				member = new MemberVO();
				member.setNum(rs.getInt("num"));
				member.setId(rs.getString("id"));
				member.setPasswd(rs.getString("passwd"));	
			}
			
			
		}catch(Exception e) {
			throw new Exception (e);
		}finally {
			executeClose(rs, pstmt, conn);
		}
		
		return member;
	}
	
	//회원 상세 정보
	public MemberVO getMember(int num) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVO member = null;
		String sql = null;
		
		try {
			//Connection 객체 생성
			conn = getConnection();
			//SQL문 작성
			sql = "SELECT * FROM zmember WHERE num = ?";
			//PrepraredStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			//SQL문 실행
			rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new MemberVO();
				
				member.setNum(rs.getInt("num"));
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPasswd(rs.getString("passwd"));
				member.setPhone(rs.getString("phone"));
				member.setEmail(rs.getString("email"));
				member.setAddress(rs.getString("address"));
				member.setReg_date(rs.getDate("reg_date"));
			}
			
			
		}catch(Exception e) {
			throw new Exception (e);
		}finally {
			executeClose(rs, pstmt, conn);
		}
		return member;
	}
	
	//회원정보수정
	public void updateMember(MemberVO member) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//Connection 객체 생성
			conn = getConnection();
			//SQL문 작성
			sql = "UPDATE zmember SET name = ?, passwd = ?, phone = ?, email = ?, address = ? WHERE num = ?";
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getPhone());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getAddress());
			pstmt.setInt(6, member.getNum());
			//SQL문 실행
			pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			throw new Exception (e);
		}finally {
			executeClose(null, pstmt, conn);
		}
	}
	
	//회원탈퇴(회원정보 삭제)
	public void deleteMember(int num) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//Connection 객체 생성
			conn = getConnection();
			//SQL문 작성
			sql = "DELETE FROM zmember WHERE num = ?";
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			//SQL문 실행
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			throw new Exception (e);
		}finally {
			executeClose(null, pstmt, conn);
		}
	}
	
}
