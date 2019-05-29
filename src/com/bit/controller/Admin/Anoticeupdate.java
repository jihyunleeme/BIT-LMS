package com.bit.controller.Admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.dao.NoticeDao;
import com.bit.model.dto.NoticeDto;

@WebServlet("/Anoticeupdate.bit")
public class Anoticeupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Anoticeupdate() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Admin/Anoticeupdate.jsp");
		String idx = request.getParameter("idx");
		int num = Integer.parseInt(idx);

		NoticeDao dao = new NoticeDao();
		NoticeDto dto = new NoticeDto();
		try {
			dto = dao.aNoticedetail(num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("Anoticeupdate", dto);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String sub = request.getParameter("sub");
		String cont = request.getParameter("cont");
		String idx = request.getParameter("idx");
		String list = request.getParameter("list");
		String update = request.getParameter("update");
		int num = Integer.parseInt(idx);
		NoticeDao dao = new NoticeDao();
		try {
			if (list != null) {
				response.sendRedirect("./Anotice.bit");
			} else if (update != null) {
				dao.aNoticeupdate(num, sub, cont);
				response.sendRedirect("./Anotice.bit");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
