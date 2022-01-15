package kr.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.member.vo.MemberVO;

public class MemberDAO {
	//JDBC���� 1,2�ܰ踦 �����ϰ� Connection ��ü�� ��ȯ
	private Connection getConnection() throws Exception{
		String driverName = "oracle.jdbc.OracleDriver";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "scott";
		String dbPass = "tiger";

		//JDBC���� 1�ܰ�
		Class.forName(driverName);
		//JDBC���� 2�ܰ�
		Connection conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);
		return conn;
	}
	//�ڿ�����
	private void executeClose(ResultSet rs,
			PreparedStatement pstmt,
			Connection conn) {
		if(rs != null) try {rs.close();} catch(SQLException e) {}
		if(pstmt != null) try {pstmt.close();} catch(SQLException e) {}
		if(conn != null)try {conn.close();}catch(SQLException e) {}		
	}

	//ȸ������
	public void insertMember(MemberVO member) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//Connection ��ü ����
			conn = getConnection();
			//SQL�� �ۼ�
			sql = "INSERT INTO zmember (num, id, name, passwd, phone, email, address, reg_date) VALUES (zmember_seq.nextval, ?, ?, ?, ?, ?, ?, SYSDATE)";
			
			//PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getPasswd());
			pstmt.setString(4, member.getPhone());
			pstmt.setString(5, member.getEmail());	
			pstmt.setString(6, member.getAddress());
			
			//SQL�� ����
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			throw new Exception (e);
		}finally {
			//�ڿ�����
			executeClose(null, pstmt, conn);
		}
		
	}
	
	//ID �ߺ� üũ �� �α��� ó��
	public MemberVO checkMember(String id) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVO member = null;
		String sql = null;
		
		try {
			//Connection ��ü ����
			conn = getConnection();
			//SQL�� �ۼ�
			sql = "SELECT * FROM zmember WHERE id = ?";
			//preparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setString(1, id);
			//SQL�� ����
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				//�ڹٺ� ��ü ����
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
	
	//ȸ�� �� ����
	public MemberVO getMember(int num) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVO member = null;
		String sql = null;
		
		try {
			//Connection ��ü ����
			conn = getConnection();
			//SQL�� �ۼ�
			sql = "SELECT * FROM zmember WHERE num = ?";
			//PrepraredStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setInt(1, num);
			//SQL�� ����
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
	
	//ȸ����������
	public void updateMember(MemberVO member) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//Connection ��ü ����
			conn = getConnection();
			//SQL�� �ۼ�
			sql = "UPDATE zmember SET name = ?, passwd = ?, phone = ?, email = ?, address = ? WHERE num = ?";
			//PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getPhone());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getAddress());
			pstmt.setInt(6, member.getNum());
			//SQL�� ����
			pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			throw new Exception (e);
		}finally {
			executeClose(null, pstmt, conn);
		}
	}
	
	//ȸ��Ż��(ȸ������ ����)
	public void deleteMember(int num) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//Connection ��ü ����
			conn = getConnection();
			//SQL�� �ۼ�
			sql = "DELETE FROM zmember WHERE num = ?";
			//PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setInt(1, num);
			//SQL�� ����
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			throw new Exception (e);
		}finally {
			executeClose(null, pstmt, conn);
		}
	}
	
}
