package com.s06.score;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.s02.preparedstatement.DBConnection;

//DAO : Data Access Object
public class ScoreDAO {
	//���� �Է�
	public void insertInfo(ScoreVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBConnection.getConnection();
			
			//SQL�� �ۼ�
			//���̺�� : score
			//�÷��� : num, name, korean, english, math, total, avg, grade, reg_date
			//       score_seq.nextval                                  SYSDATE
			sql = "INSERT INTO score(num, name, korean, english, math, "
					+ "total, avg, grade, reg_date)"
					+ "VALUES (score_seq.nextval, ?, ?, ?, ?, "
					+ "?, ?, ?, SYSDATE)";
			
			//JDBC ���� 3�ܰ�
			pstmt = conn.prepareStatement(sql);
			//SQL���� ?�� ������ �Ҵ�
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getKorean());
			pstmt.setInt(3, vo.getEnglish());
			pstmt.setInt(4, vo.getMath());
			pstmt.setInt(5, vo.makeTotal());
			pstmt.setInt(6, vo.makeAvg());
			pstmt.setString(7, vo.makeGrade());
			
			
			//JDBC ���� 4�ܰ�
			int count = pstmt.executeUpdate();
			System.out.println(count + "���� ���� �����߽��ϴ�.");
	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBConnection.executeClose(null, pstmt, conn);
		}
	}
	
	//��Ϻ���
	public void selectInfo() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC���� 1,2�ܰ�
			conn = DBConnection.getConnection();
			
			//SQL�� �ۼ�(num DESC)
			sql = "SELECT * FROM score ORDER BY num DESC";
			
			//JDBC���� 3�ܰ�
			pstmt = conn.prepareStatement(sql);
			
			//JDBC ���� 4�ܰ�
			rs = pstmt.executeQuery();
			
			System.out.println("=======================================");
			System.out.println("��ȣ �̸� ���� ���� ���� ���� ��� ��� �����");
			//while�� �̿��� �ݺ� �� ���
			//num, name, korean, english, math, total, avg, grade, red_date 
			while(rs.next()) {
				System.out.print(rs.getInt("num") + " ");
				System.out.print(rs.getString("name") + " ");
				System.out.print(rs.getInt("korean") + " ");
				System.out.print(rs.getInt("english") + " ");
				System.out.print(rs.getInt("math") + " ");
				System.out.print(rs.getInt("total") + " ");
				System.out.print(rs.getInt("avg") + " ");
				System.out.print(rs.getString("grade") + " ");
				System.out.println(rs.getDate("reg_date"));
			}
			System.out.println("=======================================");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBConnection.executeClose(rs, pstmt, conn);
		}
	}
	
	//��������
	public void selectDetailInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBConnection.getConnection();
			//SQL��
			sql = "SELECT * FROM score WHERE num = ?";
			//JDBC���� 3�ܰ�
			pstmt = conn.prepareStatement(sql);
			//SQL���� ?�� ������ �Ҵ�
			pstmt.setInt(1, num);
			
			//JDBC���� 4�ܰ�
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("��ȣ : " + rs.getInt("num"));
				System.out.println("�̸� : " + rs.getString("name"));
				System.out.println("���� : " + rs.getInt("korean"));
				System.out.println("���� : " + rs.getInt("english"));
				System.out.println("���� : " + rs.getInt("math"));
				System.out.println("���� : " + rs.getInt("total"));
				System.out.println("��� : " + rs.getInt("avg"));
				System.out.println("��� : " + rs.getString("grade"));
				System.out.println("����� : " + rs.getDate("reg_date"));
				
			}else { //���� ���� ���
				System.out.println("�˻��� ���� �����ϴ�.");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			//�ڿ�����
			DBConnection.executeClose(rs, pstmt, conn);
		}
	}
	
	//���� ����
	public void updateInfo(ScoreVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			conn = DBConnection.getConnection();
			
			sql = "UPDATE score SET name = ?, korean = ?, english = ?,"
					+ "math = ?, total = ?, avg = ?, grade = ? WHERE num = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getKorean());
			pstmt.setInt(3, vo.getEnglish());
			pstmt.setInt(4, vo.getMath());
			pstmt.setInt(5, vo.makeTotal());
			pstmt.setInt(6, vo.makeAvg());
			pstmt.setString(7, vo.makeGrade());
			pstmt.setInt(8, vo.getNum());

			int count = pstmt.executeUpdate();
			System.out.println(count + "���� ���� �����߽��ϴ�.");
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.executeClose(null, pstmt, conn);
		}
	}
	
	//���� ����
	public void delteInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//JDBC���� 1,2 �ܰ�
			conn = DBConnection.getConnection();
			//sql�� �ۼ�
			sql = "DELETE FROM score WHERE num = ?";
			//JDBC ���� 3�ܰ�
			pstmt = conn.prepareStatement(sql);
			//?�� �� �Է�
			pstmt.setInt(1, num);
			
			//JDBC ���� 4�ܰ�
			int count = pstmt.executeUpdate();
			System.out.println(count + "���� ���� �����߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.executeClose(null, pstmt, conn);
		}
	}
	
	
}
