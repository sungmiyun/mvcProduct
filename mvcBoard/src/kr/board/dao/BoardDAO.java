package kr.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.board.vo.BoardVO;

//DAO : Data Access Object
public class BoardDAO  {
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
	
	//�� ����
	public void insert(BoardVO boardVO) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//Connection ��ü ����
			conn = getConnection();
			
			//SQL�� �ۼ�
			sql = "INSERT INTO zboard (num, title, name, passwd, "
					+ "email, content, ip, reg_date) VALUES (zboard_seq.nextval, "
					+ "?, ?, ?, ?, ?, ?, SYSDATE)";
			//PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardVO.getTitle());
			pstmt.setString(2, boardVO.getName());
			pstmt.setString(3, boardVO.getPasswd());
			pstmt.setString(4, boardVO.getEmail());
			pstmt.setString(5, boardVO.getContent());
			pstmt.setString(6, boardVO.getIp());
			//SQL�� ����
			pstmt.executeUpdate();
		}catch(Exception e) {
			throw new Exception (e);
		}finally {
			executeClose(null, pstmt, conn);
		}
	}//end of insert
	
	//�� ���
	public List<BoardVO> getList() throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		List<BoardVO> list = null;
		
		try {
			//Connection ��ü ����
			conn = getConnection();
			
			//SQL�� �ۼ�
			sql = "SELECT * FROM zboard ORDER BY num DESC";
			
			//PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			
			//SQL�� ����
			rs = pstmt.executeQuery();
			
			//�ϳ��� ���ڵ� ������ �ڹٺ� �����ϰ� ������ �ڹٺ��� ArrayList�� ����
			//ArrayList ��ü ����
			list = new ArrayList<BoardVO>();
			while(rs.next()) {
				//�ڹٺ� ����
				BoardVO boardVO = new BoardVO();
				boardVO.setNum(rs.getInt("num"));
				boardVO.setTitle(rs.getString("title"));
				boardVO.setName(rs.getString("name"));
				boardVO.setReg_date(rs.getDate("reg_date"));
				
				//ArrayList�� �ڹٺ� ����
				list.add(boardVO);
			}
		}catch(Exception e) {
			throw new Exception (e);
		}finally {
			executeClose(rs, pstmt, conn);
		}
		return list;
	}//end of getList
	
	//�� ��
	public BoardVO getBoard(int num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO board = null;
		String sql = null;
		
		try {
			//Connection ��ü ����
			conn = getConnection();
			
			//sql�� �ۼ�
			sql = "SELECT * FROM zboard WHERE num = ?";
			//PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			//SQL�� �����ϰ� ������� ResultSet�� ����
			rs = pstmt.executeQuery();
			
			//�ϳ��� ���ڵ带 �����⶧���� while���� �ƴ� if�� ���
			if(rs.next()) {
				//�ڹٺ� ����
				board = new BoardVO();
				board.setNum(rs.getInt("num"));
				board.setTitle(rs.getString("title"));
				board.setName(rs.getString("name"));
				board.setPasswd(rs.getString("passwd"));
				board.setEmail(rs.getString("email"));
				board.setContent(rs.getString("content"));
				board.setReg_date(rs.getDate("reg_date"));
			}
			
			
		}catch(Exception e) {
			throw new Exception (e);
		}finally {
			executeClose(rs, pstmt, conn);
		}
		return board;
		
		
	}//end of getBoard
	
	//�� ����
	public void update(BoardVO boardVO) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//Connection ��ü ����
			conn = getConnection();
			
			//SQL�� �ۼ�
			sql = "UPDATE zboard SET title = ?, name = ?, email = ?, content = ?, ip = ? WHERE num = ?";
			
			//PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardVO.getTitle());
			pstmt.setString(2, boardVO.getName());
			pstmt.setString(3, boardVO.getEmail());
			pstmt.setString(4, boardVO.getContent());
			pstmt.setString(5, boardVO.getIp());
			pstmt.setInt(6, boardVO.getNum());	
			
			//SQL�� ����
			pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			executeClose(null, pstmt, conn);
		}
	}//end of update
	
	//�� ����
	public void delete(int num) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//Connection ��ü ����
			conn = getConnection();
			
			//SQL�� �ۼ�
			sql = "DELETE FROM zboard WHERE num = ?";
			//preparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setInt(1, num);
			
			//SQL�� ����
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			//�ڿ�����
			executeClose(null, pstmt, conn);
		}
	}//end of delete
	
}//end of class
