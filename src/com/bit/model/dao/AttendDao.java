package com.bit.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.dto.AttendDto;
import com.bit.util.MyOracle;

public class AttendDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public List<AttendDto> tAttend(String name) throws SQLException {
		// 강사에서 출석 체크 목록
		String sql = "SELECT ID,NAME,DAY,ATTEND,OUT,TARDY FROM ATTEND WHERE NAME=? ORDER BY DAY ASC";
		List<AttendDto> list = new ArrayList<AttendDto>();
		try {
			try {
				conn = MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				AttendDto attenddto = new AttendDto();
				attenddto.setId(rs.getString("id")); // 아이디
				attenddto.setName(rs.getString("name")); // 이름
				attenddto.setDay(rs.getDate("day")); // 출석날짜
				attenddto.setAttend(rs.getInt("attend"));// 출석
				attenddto.setOut(rs.getInt("out"));// 결석
				attenddto.setTardy(rs.getInt("tardy"));// 지각
				list.add(attenddto);
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

	public List<AttendDto> aAttend(String name) throws SQLException {
		// 행정에서 학생 출석 체크 목록
		String sql = "SELECT ID,NAME,DAY,ATTEND,OUT,TARDY FROM ATTEND WHERE NAME=? ORDER BY DAY ASC";
		List<AttendDto> list = new ArrayList<AttendDto>();
		try {
			try {
				conn = MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				AttendDto attenddto = new AttendDto();
				attenddto.setId(rs.getString("id")); // 아이디
				attenddto.setName(rs.getString("name")); // 이름
				attenddto.setDay(rs.getDate("day")); // 출석날짜
				attenddto.setAttend(rs.getInt("attend"));// 출석
				attenddto.setOut(rs.getInt("out"));// 결석
				attenddto.setTardy(rs.getInt("tardy"));// 지각
				list.add(attenddto);
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

	public List<AttendDto> sAttend(String id) throws SQLException {
		// 학생 출석 체크 목록
		String sql = "SELECT NAME,DAY,ATTEND,OUT,TARDY FROM ATTEND WHERE ID=? ORDER BY DAY ASC";
		List<AttendDto> list = new ArrayList<AttendDto>();
		try {
			try {
				conn = MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				AttendDto attenddto = new AttendDto();
				attenddto.setName(rs.getString("name")); // 이름
				attenddto.setDay(rs.getDate("day")); // 출석날짜
				attenddto.setAttend(rs.getInt("attend"));// 출석
				attenddto.setOut(rs.getInt("out"));// 결석
				attenddto.setTardy(rs.getInt("tardy"));// 지각
				list.add(attenddto);
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

	public void tAttendinsert(String id, String name, int attend, int out, int tardy) throws SQLException {
		// 강사 학생 출석체크
		String sql = "INSERT INTO ATTEND VALUES (?, ?, (TO_CHAR(sysdate,‘yyyy-mm-dd’)), ?, ?, ?)";

		try {
			conn = MyOracle.getConnection();
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, attend);
			pstmt.setInt(4, out);
			pstmt.setInt(5, tardy);
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

	public void tAttendupdate(String id, int attend, int out, int tardy) throws SQLException {
		// 출석 체크 수정
		String sql = "UPDATE ATTEND SET ATTEND=?, OUT=?, TARDY=? WHERE ID=?";
		try {
			conn = MyOracle.getConnection();
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, attend);
			pstmt.setInt(2, out);
			pstmt.setInt(3, tardy);
			pstmt.setString(4, id);
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
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
