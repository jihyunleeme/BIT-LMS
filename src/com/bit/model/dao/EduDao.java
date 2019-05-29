package com.bit.model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.dto.EduAddDto;
import com.bit.model.dto.EduDto;
import com.bit.util.MyOracle;

public class EduDao { 
	 private Connection conn;
	   private PreparedStatement pstmt;
	   private ResultSet rs;
	   
	   public List<EduDto> aEdu() throws SQLException { // 행정 강의 목록 
	      String sql="SELECT NUM, SUB, TEACHERNAME FROM EDU ORDER BY NUM DESC";
	      List<EduDto> list =new ArrayList<EduDto>();
	      try{
	         try {
	            conn=MyOracle.getConnection();
	         } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	         }
	         pstmt=conn.prepareStatement(sql);
	         rs=pstmt.executeQuery();
	         while(rs.next()){
	        	 EduDto dto = new EduDto();
	        	 	dto.setNum(rs.getInt("num"));//글번호
	        	 	dto.setSub(rs.getString("sub"));//제목 
	        	 	dto.setTeachername(rs.getString("teachername")); //강사명
	            	list.add(dto);
	         }
	      }finally{
	         if(rs!=null)rs.close();
	         if(pstmt!=null)pstmt.close();
	         if(conn!=null)conn.close();
	      }
	      return list;
	   }
	   
	   public List<EduDto> mEdu() throws SQLException { // 메인 페이지 교육과정 
		      String sql="SELECT NUM,SUB, TEACHERNAME, STNUM, CALENDAR FROM EDU ORDER BY NUM DESC ";
		      List<EduDto> list =new ArrayList<EduDto>();
		      try{
		         try {
		            conn=MyOracle.getConnection();
		         } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		         }
		         pstmt=conn.prepareStatement(sql);
		         rs=pstmt.executeQuery();
		         while(rs.next()){
		        	 EduDto dto = new EduDto();
		        	 	dto.setNum(rs.getInt("num"));//글번호
		        	 	dto.setSub(rs.getString("sub"));//제목
		        	 	dto.setTeachername(rs.getString("teachername")); //강사명
		        	 	dto.setStnum(rs.getInt("stnum")); // 학생 정원수
		        	 	dto.setCalendar(rs.getString("CALENDAR")); // 교육일정
		        	 	list.add(dto);
		         }
		      }finally{
		         if(rs!=null)rs.close();
		         if(pstmt!=null)pstmt.close();
		         if(conn!=null)conn.close();
		      }
		      return list;
		   }
	   
	   public EduDto aEdudetail(int num) throws SQLException{ //행정 강의 상세보기
	      String sql="select NUM, SUB, TEACHERNAME, CALENDAR, EDU from EDU where num=?";
	      EduDto edudto = new EduDto();
	      try {
				conn=MyOracle.getConnection();
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				rs=pstmt.executeQuery();
				 if(rs.next()){
					 	edudto.setNum(rs.getInt("num"));//글번호
			         	edudto.setSub(rs.getString("sub"));//제목 
			         	edudto.setTeachername(rs.getString("teachername")); //강사명
			          	edudto.setCalendar(rs.getString("calendar"));//교육일정
			          	edudto.setEdu(rs.getString("edu")); // 교육내용
				 }
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally{
				try {
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return edudto;
		}
	   
	   public EduDto mEdudetail(int num) throws SQLException{ //메인페이지 교육과정 상세보기
		      String sql="SELECT NUM, SUB, TEACHERNAME, CALENDAR, EDU FROM EDU WHERE NUM=?";
		      EduDto edudto = new EduDto();
		      try {
					conn=MyOracle.getConnection();
					pstmt=conn.prepareStatement(sql);
					pstmt.setInt(1, num);
					rs=pstmt.executeQuery();
					 if(rs.next()){
						 	edudto.setNum(rs.getInt("num"));//글번호
				         	edudto.setSub(rs.getString("sub"));//제목 
				         	edudto.setTeachername(rs.getString("teachername")); //강사명
				          	edudto.setCalendar(rs.getString("calendar"));//교육일정
				          	edudto.setEdu(rs.getString("edu")); // 교육내용
					 }
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally{
					try {
						if(rs!=null)rs.close();
						if(pstmt!=null)pstmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				return edudto;
			}

		public void aAeduadd(String sub, String teachername, int stnum, String calendar, String edu, String teacher) throws SQLException{
			// 행정 강의 개설
			String sql = "INSERT INTO EDU VALUES (EDU_SEQ.NEXTVAL, ?, ?, ?, ?, ?, ?)";
			try {
				conn=MyOracle.getConnection();
				conn.setAutoCommit(false);
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, sub);
				pstmt.setString(2, teachername);
				pstmt.setInt(3, stnum);
				pstmt.setString(4, calendar);
				pstmt.setString(5, edu);
				pstmt.setString(6, teacher);
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
		
		public void mEduadd(String id, String name, String sub, int num) throws SQLException{
			// 학생 수강신청 
			String sql = "INSERT INTO EDUADD VALUES (?, ?, ?, ?, 0)";
			try {
				conn=MyOracle.getConnection();
				conn.setAutoCommit(false);
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, num);
				pstmt.setString(4, sub);
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
		
		public void aEduupdate(int num, String sub, String teachername, int stnum, String calendar, String edu, String teacher) throws SQLException{
			// 행정 강의 수정
			String sql = "UPDATE EDU SET SUB=?, TEACHERNAME=?, STNUM=?, CALENDAR=?, EDU=?, TEACHER=? WHERE NUM=?";
			try {
				conn=MyOracle.getConnection();
				conn.setAutoCommit(false);
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, sub);
				pstmt.setString(2, teachername);
				pstmt.setInt(3, stnum);
				pstmt.setString(4, calendar);
				pstmt.setString(5, edu);
				pstmt.setString(6, teacher);
				pstmt.setInt(7, num);
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
		public void eduDelete(int num) throws ClassNotFoundException, SQLException {
			String sql="DELETE FROM EDU WHERE NUM=?";
			conn=MyOracle.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeQuery();
			conn.commit();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		
		public List<EduAddDto> Astudentok() throws SQLException, ClassNotFoundException {
			String sql="SELECT * FROM EDUADD";
			conn=MyOracle.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			List<EduAddDto> list =new ArrayList<EduAddDto>();
			
			while(rs.next()) {
				EduAddDto dto=new EduAddDto();
				dto.setNum(rs.getInt("num"));
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setSub(rs.getString("sub"));
				dto.setApproval(rs.getInt("approval"));
				list.add(dto);
			}
			return list;
		}
		
		public void Approval(String id) throws ClassNotFoundException, SQLException {
			String sql="update eduadd set Approval = 1 where id = ?";
			conn=MyOracle.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeQuery();
		}
		
		
}
