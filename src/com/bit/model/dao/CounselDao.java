package com.bit.model.dao;
import java.sql.*;
import java.util.*;

import com.bit.model.dao.CounselDao;
import com.bit.model.dto.CounselDto;
import com.bit.model.dto.ReplyDto;
import com.bit.util.MyOracle;
public class CounselDao {  
	 private java.sql.Connection conn;
	   private PreparedStatement pstmt;
	   private ResultSet rs;
	   
	   public List<CounselDto> mCounselview() throws SQLException { // �л� �¶��� ��� �Խ��� ��� ��ȸ
		      String sql="SELECT NUM, SUB, WUSER FROM COUNSEL ORDER BY NUM DESC";
		      List<CounselDto> list =new ArrayList<CounselDto>();
		      try{
		         try {
		            conn=MyOracle.getConnection();
		         } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		         }
		         pstmt=conn.prepareStatement(sql);
		         rs=pstmt.executeQuery();
		         while(rs.next()){
		        	CounselDto counseldto = new CounselDto();
		            counseldto.setNum(rs.getInt("num")); //�۹�ȣ
		            counseldto.setSub(rs.getString("sub")); //����
		            counseldto.setWuser(rs.getString("wuser")); //�ۼ���
		           
		            list.add(counseldto);
		         }
		      }finally{
		         if(rs!=null)rs.close();
		         if(pstmt!=null)pstmt.close();
		         if(conn!=null)conn.close();
		      }
		      return list;
		   }
	   
		public List<CounselDto> mGetpw(int num) throws SQLException {
			// ���� �¶��� ��� �Խ��� �� ��ȸ ���� �亯 �۹�ȣ �̾ƿ���
			String sql = "SELECT PW FROM COUNSEL WHERE NUM =?";
			List<CounselDto> list = new ArrayList<CounselDto>();
			try {
				try {
					conn = MyOracle.getConnection();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					CounselDto mCounselpwdto = new CounselDto();
					mCounselpwdto.setPw(rs.getInt("pw"));//��й�ȣ
					list.add(mCounselpwdto);
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
	   
	   public List<CounselDto> mCounselviewdetail(int num) throws SQLException { 
		   // �л� �¶��� ��� �Խ��� �� ��ȸ �л� ����
		      String sql="SELECT NUM, SUB, WUSER, WDAY, CONT FROM COUNSEL WHERE NUM=?";
		      List<CounselDto> list =new ArrayList<CounselDto>();
		      try{
		         try {
		            conn=MyOracle.getConnection();
		         } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		         }
		         pstmt=conn.prepareStatement(sql);
		         pstmt.setInt(1, num);
		         rs=pstmt.executeQuery();
		         while(rs.next()){
		        	CounselDto counseldtodetail = new CounselDto();
		            counseldtodetail.setNum(rs.getInt("num")); //�۹�ȣ
		            counseldtodetail.setSub(rs.getString("sub")); //����
		            counseldtodetail.setWuser(rs.getString("wuser")); //�ۼ���
		            counseldtodetail.setWday(rs.getDate("wday")); //�ۼ���
		            counseldtodetail.setCont(rs.getString("cont")); //����
		           
		            list.add(counseldtodetail);
		         }
		      }finally{
		         if(rs!=null)rs.close();
		         if(pstmt!=null)pstmt.close();
		         if(conn!=null)conn.close();
		      }
		      return list;
		   }
		   
/*		   public CounselDto mCounseldetail(int num) throws SQLException{ // �л� �¶��� ��� �ش� �Խñ� �󼼺���
		      String sql="SELECT COUNSEL.NUM, COUNSEL.SUB, COUNSEL.CONT, COUNSEL.WUSER, COUNSEL.WDAY, REPLY.CONT, REPLY.WUSER, REPLY.WDAY FROM COUNSEL, REPLY WHERE COUNSEL.NUM = REPLY.NUM"
		      NoticeDto noticedto = new NoticeDto();
		      ReplyDto replydto = new ReplyDto();
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
*/
		   
		   public void mCounselinsert(String sub, String cont, String wuser, int pw) throws SQLException{ // �¶��� ��� �Խñ� �ۼ�
			   String sql = "INSERT INTO COUNSEL VALUES (COUNSEL_SEQ.NEXTVAL, ?, ?, ?, SYSDATE, ?)";
			   try {
				conn=MyOracle.getConnection();
				conn.setAutoCommit(false);
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, sub);
				pstmt.setString(2, cont);
				pstmt.setString(3, wuser);
				pstmt.setInt(4, pw);
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
		   public void counseDelete(int num) throws ClassNotFoundException, SQLException {
			   //��ȸ���� �ۼ��� ����� ����
			   String sql="DELETE FROM COUNSEL WHERE NUM=?";
			   conn=MyOracle.getConnection();
			   pstmt=conn.prepareStatement(sql);
			   pstmt.setInt(1, num);
			   pstmt.executeQuery();
			   conn.commit();
		       if(pstmt!=null)pstmt.close();
		       if(conn!=null)conn.close();
		}
		   
	}