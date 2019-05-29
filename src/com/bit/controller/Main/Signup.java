package com.bit.controller.Main;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.dao.UsersDao;

@WebServlet("/Signup.bit")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Signup() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Main/Signup.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	request.setCharacterEncoding("UTF-8");	
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
	String pw1=request.getParameter("pw1");
	String email=request.getParameter("email");
	String name=request.getParameter("name");
	String birth=request.getParameter("birth");
	UsersDao dao=new UsersDao();
	try {
		dao.signup(id, name, pw, email, birth);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	response.sendRedirect("./Main.bit");
	
	}

}
