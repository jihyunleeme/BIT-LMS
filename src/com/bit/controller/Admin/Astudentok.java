package com.bit.controller.Admin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.dao.EduDao;
import com.bit.model.dto.EduAddDto;

@WebServlet("/Astudentok.bit")
public class Astudentok extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Astudentok() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Admin/Astudentok.jsp");

		EduDao dao = new EduDao();
		List<EduAddDto> list = null;
		try {
			list = dao.Astudentok();
			request.setAttribute("Astudentok", list);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("¹ºµ¥?");
		String Approval = request.getParameter("Approval");
		String id = "id1";
		EduDao dao = new EduDao();
		try {
			dao.Approval(id);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("./Astudentok.bit");

	}

}
