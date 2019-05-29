package com.bit.model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.dto.UsersDto;
import com.bit.util.MyOracle;
public class UsersDao { 
	 private Connection conn;
	   private PreparedStatement pstmt;
	   private ResultSet rs;
	   
	   public List<UsersDto> aStudentok() throws SQLException { // 행정 권한설정 보기 
		      String sql="SELECT ID,NAME,POWER FROM USERS ORDER BY POWER ASC";
	      List<UsersDto> list =new ArrayList<UsersDto>();
	      try{
	         try {
	            conn=MyOracle.getConnection();
	         } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	         }
	         pstmt=conn.prepareStatement(sql);
	         rs=pstmt.executeQuery();
	         while(rs.next()){
	        	UsersDto usersdto = new UsersDto();
	        	usersdto.setId(rs.getString("id")); //아이디
	        	usersdto.setName(rs.getString("name")); //이름
	        	usersdto.setPower(rs.getInt("power")); //권한
	            list.add(usersdto);
	         }        
	      }finally{
	         if(rs!=null)rs.close();
	         if(pstmt!=null)pstmt.close();
	         if(conn!=null)conn.close();
	      }
	      return list;
	   }
	   
	   public void aStudentokinsert(int power, String id) throws SQLException{ // 행정 권한 부여 수정
		   String sql = "UPDATE USERS SET POWER=? WHERE ID=?";
		   
		   try {
			conn=MyOracle.getConnection();
			conn.setAutoCommit(false);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, power);
			pstmt.setString(2, id);
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
	   
	   public void signup(String id, String name, String pw, String email, String birth) throws SQLException{ // 회원가입
		   String sql = "INSERT INTO USERS VALUES (?, ?, ?, ?, ?, 0)";
		   
		   try {
			conn=MyOracle.getConnection();
			conn.setAutoCommit(false);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, pw);
			pstmt.setString(4, email);
			pstmt.setString(5, birth);
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
	 
	   public UsersDto login(String id) throws SQLException, ClassNotFoundException{ // 로그인할 떄 id로  pw 값 뽑아오기
		      String sql="SELECT * FROM USERS WHERE ID=?";
		      UsersDto dto=new UsersDto();
		      conn=MyOracle.getConnection();
		      pstmt=conn.prepareStatement(sql);
		      pstmt.setString(1, id);
		      rs=pstmt.executeQuery();
		      while (rs.next()) {
		    	  dto.setPw(rs.getString("PW"));
		    	  dto.setPower(rs.getInt("POWER"));
		    	  dto.setName(rs.getString("name"));
		      }
		      return dto;
		   }
	   
	   public UsersDto aPowervalue(String id) throws SQLException{ // id로 해당 학생 권한 뽑아오기
		      String sql="SELECT POWER FROM USERS WHERE ID=?";
		      UsersDto logindvaluedto = new UsersDto();
		      try{
		         try {
		            conn=MyOracle.getConnection();
		            conn.setAutoCommit(false);
		         } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		         }
		         pstmt=conn.prepareStatement(sql);
		         pstmt.setString(1, id);
		         rs=pstmt.executeQuery();
		         if(rs.next()){
		        	logindvaluedto.setPower(rs.getInt("power")); //권한
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
		      
		      return logindvaluedto;
		   }
	   
	   public void aPower(int power, String id) throws SQLException{ 
		    // 조회한 해당 학생 권한 값 수정
		   String sql = "UPDATE USERS SET POWER=? WHERE ID=?";
		   
		   try {
			conn=MyOracle.getConnection();
			conn.setAutoCommit(false);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, power);
			pstmt.setString(2, id);
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
	   
	   public UsersDto usersSelect(String select) throws ClassNotFoundException, SQLException {
		 String sql="SELECT ID,NAME FROM USERS WHERE ID=?";
		 UsersDto dto=new UsersDto();
		 conn=MyOracle.getConnection();
		 pstmt=conn.prepareStatement(sql);
		 pstmt.setString(1, select);
		 rs=pstmt.executeQuery();
		 while(rs.next()) {
			 dto.setId(rs.getString("id"));
			 dto.setName(rs.getString("name"));
		 }
		return dto;
	}
}
