package com.bit.controller.Admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.dao.ReviewDao;

@WebServlet("/Areviewinsert.bit")
public class Areviewinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Areviewinsert() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Admin/Areviewinsert.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	request.setCharacterEncoding("UTF-8");	
	String sub=request.getParameter("sub");
	String cont=request.getParameter("cont");
	System.out.println(sub);
	System.out.println(cont);
	ReviewDao dao=new ReviewDao();
	try {
		dao.aReviewinsert(sub, cont);
		response.sendRedirect("./Areview.bit");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
