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
	
	//��ǰ ���
	public void insert(ProductVO product) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//Connection ��ü ����
			conn = getConnection();
			//SQL�� �ۼ�
			sql = "INSERT INTO zproduct (num, name, price, stock, origin, content, reg_date) VALUES (zboard_seq.nextval, ?, ?, ?, ?, ?, SYSDATE)";
			//PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setInt(3, product.getStock());
			pstmt.setString(4, product.getOrigin());
			pstmt.setString(5, product.getContent());
			
			//SQL�� ����
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			throw new Exception (e);
		}finally {
			executeClose(null, pstmt, conn);
		}
	}
	
	//��ǰ ���
	public List<ProductVO> getList() throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		List<ProductVO> list = null;
		
		try {
			//Connection ��ü ����
			conn = getConnection();
			
			//SQL�� �ۼ�
			sql = "SELECT * FROM zproduct ORDER BY num DESC";
			//PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			
			//SQL�� ����
			rs = pstmt.executeQuery();
			
			//ArayList ��ü ����
			list = new ArrayList<ProductVO>();
			while(rs.next()) {
				ProductVO product = new ProductVO();
				product.setNum(rs.getInt("num"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));
				product.setStock(rs.getInt("stock"));
				product.setOrigin(rs.getString("origin"));
				product.setReg_date(rs.getDate("reg_date"));
				
				//ArrayList�� �ڹٺ� ����
				list.add(product);
			}
			
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			executeClose(rs, pstmt, conn);
		}
		return list;
	}
	
	//��ǰ �� ����
	public ProductVO getProduct(int num) throws Exception{
		ProductVO product = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//Connection ��ü ����
			conn = getConnection();
			
			//SQL�� �ۼ�
			sql = "SELECT * FROM zproduct WHERE num = ?";
			
			//PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			//SQL���� �����ϰ� ������� REsultSet�� ���
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
	
	//��ǰ ���� ����
	public void update(ProductVO product) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//Connection ��ü ����
			conn = getConnection();
			
			//SQL�� �ۼ�
			sql = "UPDATE zproduct SET name = ?, price = ?, stock = ?, origin = ?, content = ? WHERE num = ?";
				
			//PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setInt(3, product.getStock());
			pstmt.setString(4, product.getOrigin());
			pstmt.setString(5, product.getContent());	
			pstmt.setInt(6, product.getNum());
			
			//SQL�� ����
			pstmt.executeUpdate();
			
		}catch(Exception e){
			throw new Exception (e);
		}finally {
			executeClose(null, pstmt, conn);
		}
	}
	
	//��ǰ ����
	public void delete(int num) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//Connection ��ü ����
			conn = getConnection();
			
			//SQL�� �ۼ�
			sql = "DELETE FROM zproduct WHERE num = ? ";
			//PrparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setInt(1, num);
			
			//SQL�� ����
			pstmt.executeUpdate();
			
		}catch(Exception e){
			throw new Exception(e);
		}finally {
			executeClose(null, pstmt, conn);
		}
	}
	
	
}
