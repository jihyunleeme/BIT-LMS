package com.bit.controller.Admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.dao.EduDao;
import com.bit.model.dto.EduDto;

@WebServlet("/Aeduupdate.bit")
public class Aeduupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Aeduupdate() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Admin/Aeduupdate.jsp");
		String idx=request.getParameter("idx");
		int num=Integer.parseInt(idx);
		
		EduDao dao=new EduDao();
		EduDto dto=new EduDto();
		try {
			dto=dao.aEdudetail(num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("Aeduupdate", dto);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String idx=request.getParameter("idx");
		int num=Integer.parseInt(idx);
		String sub=request.getParameter("sub");
		String teachername=request.getParameter("teachername");
		String calendar=request.getParameter("calendar");
		String msg=request.getParameter("stnum");
		int stnum=Integer.parseInt(msg);
		String teacher=request.getParameter("teacher");
		String edu=request.getParameter("edu");
		EduDao dao=new EduDao();
		try {
			dao.aEduupdate(num, sub, teachername, stnum, calendar, edu, teacher);
			response.sendRedirect("./Aedu.bit");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
