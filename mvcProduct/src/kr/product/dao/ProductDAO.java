package kr.product.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.product.vo.ProductVO;

public class ProductDAO {
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
	
	//상품 등록
	public void insert(ProductVO product) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//Connection 객체 생성
			conn = getConnection();
			//SQL문 작성
			sql = "INSERT INTO zproduct (num, name, price, stock, origin, content, reg_date) VALUES (zboard_seq.nextval, ?, ?, ?, ?, ?, SYSDATE)";
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setInt(3, product.getStock());
			pstmt.setString(4, product.getOrigin());
			pstmt.setString(5, product.getContent());
			
			//SQL문 실행
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			throw new Exception (e);
		}finally {
			executeClose(null, pstmt, conn);
		}
	}
	
	//상품 목록
	public List<ProductVO> getList() throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		List<ProductVO> list = null;
		
		try {
			//Connection 객체 생성
			conn = getConnection();
			
			//SQL문 작성
			sql = "SELECT * FROM zproduct ORDER BY num DESC";
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//SQL문 실행
			rs = pstmt.executeQuery();
			
			//ArayList 객체 생성
			list = new ArrayList<ProductVO>();
			while(rs.next()) {
				ProductVO product = new ProductVO();
				product.setNum(rs.getInt("num"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));
				product.setStock(rs.getInt("stock"));
				product.setOrigin(rs.getString("origin"));
				product.setReg_date(rs.getDate("reg_date"));
				
				//ArrayList에 자바빈 저장
				list.add(product);
			}
			
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			executeClose(rs, pstmt, conn);
		}
		return list;
	}
	
	//상품 상세 정보
	public ProductVO getProduct(int num) throws Exception{
		ProductVO product = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//Connection 객체 생성
			conn = getConnection();
			
			//SQL문 작성
			sql = "SELECT * FROM zproduct WHERE num = ?";
			
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			//SQL문을 실행하고 결과행을 REsultSet에 담기
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				product = new ProductVO();
				product.setNum(rs.getInt("num"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));
				product.setStock(rs.getInt("stock"));
				product.setOrigin(rs.getString("origin"));
				product.setContent(rs.getString("content"));
				product.setReg_date(rs.getDate("reg_date"));
			}
			
		}catch(Exception e) {
			throw new Exception (e);
		}finally {
			executeClose(rs, pstmt, conn);
		}
		
		return product;
	}
	
	//상품 정보 수정
	public void update(ProductVO product) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//Connection 객체 생성
			conn = getConnection();
			
			//SQL문 작성
			sql = "UPDATE zproduct SET name = ?, price = ?, stock = ?, origin = ?, content = ? WHERE num = ?";
				
			//PreparedStatement 객체 수정
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setInt(3, product.getStock());
			pstmt.setString(4, product.getOrigin());
			pstmt.setString(5, product.getContent());	
			pstmt.setInt(6, product.getNum());
			
			//SQL문 실행
			pstmt.executeUpdate();
			
		}catch(Exception e){
			throw new Exception (e);
		}finally {
			executeClose(null, pstmt, conn);
		}
	}
	
	//상품 삭제
	public void delete(int num) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//Connection 객체 생성
			conn = getConnection();
			
			//SQL문 작성
			sql = "DELETE FROM zproduct WHERE num = ? ";
			//PrparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			
			//SQL문 실행
			pstmt.executeUpdate();
			
		}catch(Exception e){
			throw new Exception(e);
		}finally {
			executeClose(null, pstmt, conn);
		}
	}
	
	
}
