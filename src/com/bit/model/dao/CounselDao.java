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
	   
	   public List<CounselDto> mCounselview() throws SQLException { // 학생 온라인 상담 게시판 목록 조회
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
		            counseldto.setNum(rs.getInt("num")); //글번호
		            counseldto.setSub(rs.getString("sub")); //제목
		            counseldto.setWuser(rs.getString("wuser")); //작성자
		           
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
			// 영업 온라인 상담 게시판 상세 조회 영업 답변 글번호 뽑아오기
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
					mCounselpwdto.setPw(rs.getInt("pw"));//비밀번호
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
		   // 학생 온라인 상담 게시판 상세 조회 학생 질문
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
		            counseldtodetail.setNum(rs.getInt("num")); //글번호
		            counseldtodetail.setSub(rs.getString("sub")); //제목
		            counseldtodetail.setWuser(rs.getString("wuser")); //작성자
		            counseldtodetail.setWday(rs.getDate("wday")); //작성일
		            counseldtodetail.setCont(rs.getString("cont")); //내용
		           
		            list.add(counseldtodetail);
		         }
		      }finally{
		         if(rs!=null)rs.close();
		         if(pstmt!=null)pstmt.close();
		         if(conn!=null)conn.close();
		      }
		      return list;
		   }
		   
/*		   public CounselDto mCounseldetail(int num) throws SQLException{ // 학생 온라인 상담 해당 게시글 상세보기
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
		        	noticedto.setNum(rs.getInt("num")); //글번호
		        	noticedto.setSub(rs.getString("sub")); //제목
		        	noticedto.setCont(rs.getString("cont")); //내용
		        	noticedto.setWday(rs.getDate("wday")); //작성일
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
		   
		   public void mCounselinsert(String sub, String cont, String wuser, int pw) throws SQLException{ // 온라인 상담 게시글 작성
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
			   //비회원이 작성한 상담기록 삭제
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