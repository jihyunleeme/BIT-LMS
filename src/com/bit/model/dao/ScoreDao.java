package com.bit.model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.dto.ScoreDto;
import com.bit.util.MyOracle;
public class ScoreDao { 
	 private Connection conn;
	   private PreparedStatement pstmt;
	   private ResultSet rs;
	   
	   public List<ScoreDto> tScore() throws SQLException { // 강사 성적 목록 게시판
		      String sql="SELECT NAME,JAVA,WEB,DB FROM SCORE ORDER BY NAME ASC";
		      List<ScoreDto> list =new ArrayList<ScoreDto>();
		      try{
		         try {
		            conn=MyOracle.getConnection();
		         } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		         }
		         pstmt=conn.prepareStatement(sql);
		         rs=pstmt.executeQuery();
		         while(rs.next()){
		        	ScoreDto scoredto = new ScoreDto();
		            scoredto.setName(rs.getString("name")); //학생이름
		            scoredto.setJava(rs.getInt("java")); //자바
		            scoredto.setWeb(rs.getInt("web")); //웹
		            scoredto.setDb(rs.getInt("db")); //디비
		            list.add(scoredto);
		         }
		      }finally{
		         if(rs!=null)rs.close();
		         if(pstmt!=null)pstmt.close();
		         if(conn!=null)conn.close();
		      }
		      return list;
		   }
	   
	   public List<ScoreDto> sScore(String id) throws SQLException { // 학생 성적 목록 게시판 조회
		      String sql="SELECT NAME,JAVA,WEB,DB FROM SCORE WHERE ID=?";
		      List<ScoreDto> list =new ArrayList<ScoreDto>();
		      try{
		         try {
		            conn=MyOracle.getConnection();
		         } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		         }
		         pstmt=conn.prepareStatement(sql);
		         pstmt.setString(1, id);
		         rs=pstmt.executeQuery();
		         while(rs.next()){
		        	ScoreDto scoredto = new ScoreDto();
		            scoredto.setName(rs.getString("name")); //학생이름
		            scoredto.setJava(rs.getInt("java")); //자바
		            scoredto.setWeb(rs.getInt("web")); //웹
		            scoredto.setDb(rs.getInt("db")); //디비
		            list.add(scoredto);
		         }
		      }finally{
		         if(rs!=null)rs.close();
		         if(pstmt!=null)pstmt.close();
		         if(conn!=null)conn.close();
		      }
		      return list;
		   }
		  
	public void tScoreinsert(String name, String id, int java, int web, int db) throws SQLException{ // 강사 성적 입력
		String sql = "INSERT INTO SCORE VALUES (?, ?, ?, ?, ?)";
			   
			try {
				conn=MyOracle.getConnection();
				conn.setAutoCommit(false);
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, id);
				pstmt.setInt(3, java);
				pstmt.setInt(4, web);
				pstmt.setInt(5, db);
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
		   
	 public void tScoreupdate(String id, int java, int web, int db) throws SQLException{ // 강사 성적 수정
		 String sql = "UPDATE SCORE SET JAVA=?,WEB=?,DB=? WHERE ID=?";
		 	try {
				conn=MyOracle.getConnection();
				conn.setAutoCommit(false);
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, java);
				pstmt.setInt(2, web);
				pstmt.setInt(3, db);
				pstmt.setString(4, id);
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
		   
		   public void scoredelete(String id) throws SQLException { 
			   // 강사마이페이지 학생 성적 삭제
				String sql="DELETE FROM SCORE WHERE ID=?";
				try {
					conn=MyOracle.getConnection();
					conn.setAutoCommit(false);
					pstmt=conn.prepareStatement(sql);
					pstmt.setString(1, id);
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
