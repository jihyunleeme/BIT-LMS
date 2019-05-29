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

@WebServlet("/Anoticeinsert.bit")
public class Anoticeinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Anoticeinsert() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Admin/Anoticeinsert.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	String sub=request.getParameter("sub");
	String cont=request.getParameter("cont");
	NoticeDao dao=new NoticeDao();
	try {
		dao.aNoticeinsert(sub, cont);
		response.sendRedirect("./Anotice.bit");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
