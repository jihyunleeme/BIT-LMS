package com.bit.model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.dto.NoticeDto;
import com.bit.util.MyOracle;
public class NoticeDao {
	   private Connection conn;
	   private PreparedStatement pstmt;
	   private ResultSet rs;
	   
	   public List<NoticeDto> aNotice() throws SQLException { 
		   // ���� �������� ���
	      String sql="SELECT NUM, SUB, WDAY FROM NOTICE ORDER BY NUM DESC";
	      List<NoticeDto> list =new ArrayList<NoticeDto>();
	      try{
	         try {
	            conn=MyOracle.getConnection();
	         } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	         }
	         pstmt=conn.prepareStatement(sql);
	         rs=pstmt.executeQuery();
	         while(rs.next()){
	        	NoticeDto noticedto = new NoticeDto();
	            noticedto.setNum(rs.getInt("num")); //�۹�ȣ
	            noticedto.setSub(rs.getString("sub")); //����
	            noticedto.setWday(rs.getDate("wday")); //�ۼ���
	           
	            list.add(noticedto);
	         }
	      }finally{
	         if(rs!=null)rs.close();
	         if(pstmt!=null)pstmt.close();
	         if(conn!=null)conn.close();
	      }
	      return list;
	   }
	   
	   public List<NoticeDto> mNotice() throws SQLException { 
		   // ���������� �������� ���
		      String sql="SELECT NUM, SUB, WDAY FROM NOTICE ORDER BY NUM DESC ";
		      List<NoticeDto> list =new ArrayList<NoticeDto>();
		      try{
		         try {
		            conn=MyOracle.getConnection();
		         } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		         }
		         pstmt=conn.prepareStatement(sql);
		         rs=pstmt.executeQuery();
		         while(rs.next()){
		        	 NoticeDto noticedto = new NoticeDto();
		            noticedto.setNum(rs.getInt("num")); //�۹�ȣ
		            noticedto.setSub(rs.getString("sub")); //����
		            noticedto.setWday(rs.getDate("wday")); //�ۼ���
		           
		            list.add(noticedto);
		         }
		      }finally{
		         if(rs!=null)rs.close();
		         if(pstmt!=null)pstmt.close();
		         if(conn!=null)conn.close();
		      }
		      return list;
		   }
	   
	   public NoticeDto aNoticedetail(int num) throws SQLException{ // ���� �������� �Խñ� Ȯ��
	      String sql="SELECT NUM, SUB, CONT, WDAY FROM NOTICE WHERE NUM=?";
	      NoticeDto noticedto = new NoticeDto();
	      try{
	         try {
	            conn=MyOracle.getConnection();
	            conn.setAutoCommit(false);
	         } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	         }
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setInt(1, num);
	         rs=pstmt.executeQuery();
	         if(rs.next()){
	        	noticedto.setNum(rs.getInt("num")); //�۹�ȣ
	        	noticedto.setSub(rs.getString("sub")); //����
	        	noticedto.setCont(rs.getString("cont")); //����
	        	noticedto.setWday(rs.getDate("wday")); //�ۼ���
	         }
	         conn.commit();
	      }catch(SQLException e){
	         conn.rollback();
	      }finally{
	         conn.setAutoCommit(true);
	         if(rs!=null)rs.close();
	         if(pstmt!=null)pstmt.close();
	         if(conn!=null)conn.close();
	      }
	      
	      return noticedto;
	   }
	   
	   public NoticeDto mNoticedetail(int num) throws SQLException{ // ���������� �������� �Խñ� Ȯ��
		      String sql="SELECT NUM, SUB, CONT, WDAY FROM NOTICE WHERE NUM=?";
		      NoticeDto noticedto = new NoticeDto();
		      try{
		         try {
		            conn=MyOracle.getConnection();
		            conn.setAutoCommit(false);
		         } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		         }
		         pstmt=conn.prepareStatement(sql);
		         pstmt.setInt(1, num);
		         rs=pstmt.executeQuery();
		         if(rs.next()){
		        	noticedto.setNum(rs.getInt("num")); //�۹�ȣ
		        	noticedto.setSub(rs.getString("sub")); //����
		        	noticedto.setCont(rs.getString("cont")); //����
		        	noticedto.setWday(rs.getDate("wday")); //�ۼ���
		         }
		         conn.commit();
		      }catch(SQLException e){
		         conn.rollback();
		      }finally{
		         conn.setAutoCommit(true);
		         if(rs!=null)rs.close();
		         if(pstmt!=null)pstmt.close();
		         if(conn!=null)conn.close();
		      }
		      
		      return noticedto;
		   }
	   
	   public void aNoticeinsert(String sub, String cont) throws SQLException{ // ���� �������� �Խñ� �ۼ�
		   String sql = "INSERT INTO NOTICE VALUES (NOTICE_SEQ.NEXTVAL, ?, ?, SYSDATE)";
		   
		   try {
			conn=MyOracle.getConnection();
			conn.setAutoCommit(false);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, sub);
			pstmt.setString(2, cont);
			pstmt.executeUpdate();
			conn.commit();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			conn.rollback();
		}finally{
			conn.setAutoCommit(true);
	         if(rs!=null)rs.close();
	         if(pstmt!=null)pstmt.close();
	         if(conn!=null)conn.close();
		}
		   
	   }
	   
	   public void aNoticeupdate(int num, String sub, String cont) throws SQLException{ // ���� �������� �Խñ� ����
		   String sql = "UPDATE NOTICE SET SUB=?, CONT=?, WDAY=SYSDATE WHERE NUM=?";
		   
		   try {
			conn=MyOracle.getConnection();
			conn.setAutoCommit(false);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, sub);
			pstmt.setString(2, cont);
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
		}finally{
			conn.setAutoCommit(true);
	         if(pstmt!=null)pstmt.close();
	         if(conn!=null)conn.close();
		}
		   
	   }
	   
	   public void noticeDelete(int num) throws SQLException { // ���� �������� �Խ��� ����
			String sql="DELETE FROM NOTICE WHERE NUM=?";
			try {
				conn=MyOracle.getConnection();
				conn.setAutoCommit(false);
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				pstmt.executeUpdate();
				conn.commit();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
				conn.rollback();
			} finally {
				try {
					conn.setAutoCommit(true);
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
}
	   
	 