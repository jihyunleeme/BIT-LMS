package com.bit.controller.Student;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bit.model.dao.ScoreDao;
import com.bit.model.dto.ScoreDto;

@WebServlet("/Sscore.bit")
public class Sscore extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Sscore() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Student/Sscore.jsp");
		ScoreDao dao = new ScoreDao();
		List<ScoreDto> list = null;
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");

		if (id == null) {
			id = "id1";
		}

		try {
			list = dao.sScore(id);
			System.out.println(list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("Sscore", list);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
