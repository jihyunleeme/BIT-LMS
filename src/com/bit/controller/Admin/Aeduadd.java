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

@WebServlet("/Aeduadd.bit")
public class Aeduadd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Aeduadd() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd= request.getRequestDispatcher("Admin/Aeduadd.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String sub=request.getParameter("sub");
		String teachername=request.getParameter("teachername");
		String calendar=request.getParameter("calendar");
		String msg=request.getParameter("stnum");
		int stnum=Integer.parseInt(msg);
		String teacher=request.getParameter("teacher");
		String edu=request.getParameter("edu");
		EduDao dao=new EduDao();
		try {
			dao.aAeduadd(sub, teachername, stnum, calendar, edu, teacher);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("./Aedu.bit");
		
		
		
	}

}
