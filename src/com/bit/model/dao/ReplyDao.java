package com.bit.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.dto.CounselDto;
import com.bit.model.dto.ReplyDto;
import com.bit.util.MyOracle;

public class ReplyDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public List<CounselDto> bCounsel() throws SQLException { // ���� �¶��� ��� �Խ��� ��� ��ȸ
		String sql = "SELECT NUM, SUB, WUSER, WDAY FROM COUNSEL ORDER BY NUM DESC";
		List<CounselDto> list = new ArrayList<CounselDto>();
		try {
			try {
				conn = MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				CounselDto bcounseldto = new CounselDto();
				bcounseldto.setNum(rs.getInt("num")); // �۹�ȣ
				bcounseldto.setSub(rs.getString("sub")); // ����
				bcounseldto.setWuser(rs.getString("wuser")); // �ۼ���
				bcounseldto.setWday(rs.getDate("wday")); // �ۼ���
				list.add(bcounseldto);
			}
		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
		return list;
	}

	public List<ReplyDto> bCounselviewdetail(int num) throws SQLException {
		// ���� �¶��� ��� �Խ��� �� ��ȸ ���� �亯
		String sql = "SELECT NUM, WUSER, CONT, WDAY FROM REPLY WHERE NUM = ?";
		List<ReplyDto> list = new ArrayList<ReplyDto>();
		try {
			try {
				conn = MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ReplyDto bcounseldtodetail = new ReplyDto();
				bcounseldtodetail.setNum(rs.getInt("num"));//�� ��ȣ
				bcounseldtodetail.setWuser(rs.getString("wuser")); // �ۼ���
				bcounseldtodetail.setCont(rs.getString("cont")); // ����
				bcounseldtodetail.setWday(rs.getDate("wday")); // �ۼ���

				list.add(bcounseldtodetail);
			}
		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
		return list;
	}
	
	public List<ReplyDto> bGetnum() throws SQLException {
		// ���� �¶��� ��� �Խ��� �� ��ȸ ���� �亯 �۹�ȣ �̾ƿ���
		String sql = "SELECT NUM FROM REPLY";
		List<ReplyDto> list = new ArrayList<ReplyDto>();
		try {
			try {
				conn = MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ReplyDto bcounseldtodetail = new ReplyDto();
				bcounseldtodetail.setNum(rs.getInt("num"));//�� ��ȣ
				list.add(bcounseldtodetail);
			}
		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
		return list;
	}
	/*
	 * public CounselDto bCounseldetail(int num) throws SQLException{ // ���� �¶��� ���
	 * �ش� �Խñ� �󼼺��� �亯 String
	 * sql="SELECT COUNSEL.NUM, COUNSEL.SUB, COUNSEL.CONT, COUNSEL.WUSER, COUNSEL.WDAY, REPLY.CONT, REPLY.WUSER, REPLY.WDAY FROM COUNSEL, REPLY WHERE COUNSEL.NUM = REPLY.NUM"
	 * NoticeDto noticedto = new NoticeDto(); ReplyDto replydto = new ReplyDto();
	 * try{ try { conn=MyOracle.getConnection(); conn.setAutoCommit(false); } catch
	 * (ClassNotFoundException e) { e.printStackTrace(); }
	 * pstmt=conn.prepareStatement(sql); pstmt.setInt(1, num);
	 * rs=pstmt.executeQuery(); if(rs.next()){ noticedto.setNum(rs.getInt("num"));
	 * //�۹�ȣ noticedto.setSub(rs.getString("sub")); //����
	 * noticedto.setCont(rs.getString("cont")); //����
	 * noticedto.setWday(rs.getDate("wday")); //�ۼ��� } conn.commit();
	 * }catch(SQLException e){ conn.rollback(); }finally{ conn.setAutoCommit(true);
	 * if(rs!=null)rs.close(); if(pstmt!=null)pstmt.close();
	 * if(conn!=null)conn.close(); }
	 * 
	 * return noticedto; }
	 */

	public void bCounselinsert(int num, String cont, String wuser) throws SQLException {
		// ���� �¶��� ��� �亯 �ۼ�
		String sql = "INSERT INTO REPLY VALUES (?, ?, ?, SYSDATE)";
		try {
			conn = MyOracle.getConnection();
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, cont);
			pstmt.setString(3, wuser);
			pstmt.executeUpdate();
			conn.commit();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			conn.rollback();
		} finally {
			conn.setAutoCommit(true);
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}

	}

	public void bCounselupdate(int num, String cont, String wuser) throws SQLException {
		// ���� �¶��� ��� �亯 �Խñ� ����
		String sql = "UPDATE REPLY SET CONT=?, WUSER=?, WDAY=SYSDATE WHERE NUM=?";

		try {
			conn = MyOracle.getConnection();
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cont);
			pstmt.setString(2, wuser);
			pstmt.setInt(3, num);
			pstmt.executeUpdate();
			conn.commit();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			conn.rollback();
		} finally {
			conn.setAutoCommit(true);
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	}

	public void replyDelete(int num) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM REPLY WHERE NUM=?";
		conn = MyOracle.getConnection();
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, num);
		pstmt.executeQuery();
		conn.commit();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();

	}

}
