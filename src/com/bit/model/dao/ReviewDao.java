package com.bit.model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.dto.ReviewDto;
import com.bit.util.MyOracle;

public class ReviewDao { 
   private Connection conn;
   private PreparedStatement pstmt;
   private ResultSet rs;
   
   public List<ReviewDto> aReview() throws SQLException { // ���� �����л� �ı� �Խ��� ���
      String sql="SELECT NUM,SUB,WDAY FROM REVIEW ORDER BY NUM DESC";
      List<ReviewDto> list =new ArrayList<ReviewDto>();
      try{
         try {
            conn=MyOracle.getConnection();
         } catch (ClassNotFoundException e) {
            e.printStackTrace();
         }
         pstmt=conn.prepareStatement(sql);
         rs=pstmt.executeQuery();
         while(rs.next()){
        	ReviewDto reviewdto = new ReviewDto();
            reviewdto.setNum(rs.getInt("num")); //�۹�ȣ
            reviewdto.setSub(rs.getString("sub")); //����
            reviewdto.setWday(rs.getDate("wday")); //�ۼ���
            list.add(reviewdto);
         }
      }finally{
         if(rs!=null)rs.close();
         if(pstmt!=null)pstmt.close();
         if(conn!=null)conn.close();
      }
      return list;
   }
   
   public List<ReviewDto> mReview() throws SQLException { // ���������� �����л� �ı� �Խ��� ���
	   String sql="SELECT NUM,SUB,WDAY FROM REVIEW ORDER BY NUM DESC";
	   List<ReviewDto> list =new ArrayList<ReviewDto>();
	      try{
	         try {
	            conn=MyOracle.getConnection();
	         } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	         }
	         pstmt=conn.prepareStatement(sql);
	         rs=pstmt.executeQuery();
	         while(rs.next()){
	        	ReviewDto reviewdto = new ReviewDto();
	            reviewdto.setNum(rs.getInt("num")); //�۹�ȣ
	            reviewdto.setSub(rs.getString("sub")); //����
	            reviewdto.setWday(rs.getDate("wday")); //�ۼ���
	            list.add(reviewdto);
	         }
	      }finally{
	         if(rs!=null)rs.close();
	         if(pstmt!=null)pstmt.close();
	         if(conn!=null)conn.close();
	      }
	      return list;
	   }
   
   public ReviewDto aReviewdetail(int num) throws SQLException{ // ���� �����л� �ı� �Խ��� �󼼺���
      String sql="SELECT NUM,SUB,CONT,WDAY FROM REVIEW WHERE NUM=?";
      ReviewDto reviewdto = new ReviewDto();
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
        	 reviewdto.setNum(rs.getInt("num")); //�۹�ȣ
	         reviewdto.setSub(rs.getString("sub")); //����
	         reviewdto.setCont(rs.getString("cont")); //����
	         reviewdto.setWday(rs.getDate("wday")); //�ۼ���
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
      
      return reviewdto;
   }
   
   public ReviewDto mReviewdetail(int num) throws SQLException{ // ���������� �����л� �ı� �Խ��� �󼼺���
	      String sql="SELECT NUM,SUB,CONT,WDAY FROM REVIEW WHERE NUM=?";
	      ReviewDto reviewdto = new ReviewDto();
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
	        	 reviewdto.setNum(rs.getInt("num")); //�۹�ȣ
		         reviewdto.setSub(rs.getString("sub")); //����
		         reviewdto.setCont(rs.getString("cont")); //����
		         reviewdto.setWday(rs.getDate("wday")); //�ۼ���
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
	      
	      return reviewdto;
	   }
  
   public void aReviewinsert(String sub, String cont) throws SQLException{ // ���� �ı�Խ��� �Խñ� �ۼ�
	   String sql = "INSERT INTO NOTICE VALUES (REVIEW_SEQ.NEXTVAL, ?, ?, SYSDATE)";
	   
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
   
   public void aReviewupdate(int num, String sub, String cont) throws SQLException{ // ���� �ı�Խ��� �Խñ� ����
	   String sql = "UPDATE REVIEW SET SUB=?,CONT=?,WDAY=SYSDATE WHERE NUM=?";
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
   
   public void reviewDelete(int num) throws SQLException { // ���� �������� �Խ��� ����
		String sql="DELETE FROM REVIEW WHERE NUM=?";
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

