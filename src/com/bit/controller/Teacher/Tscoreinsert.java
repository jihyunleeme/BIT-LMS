package com.bit.controller.Teacher;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.dao.ScoreDao;


@WebServlet("/Tscoreinsert.bit")
public class Tscoreinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Tscoreinsert() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Teacher/Tscoreinsert.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ScoreDao dao=new ScoreDao();
		for(int i=1; i<21; i++) {
		String name=request.getParameter("name"+i);
		String id=request.getParameter("id"+i);
		String msgjava=request.getParameter("java"+i);
		String msgweb=request.getParameter("web"+i);
		String msgdb=request.getParameter("db"+i);
		int java=Integer.parseInt(msgjava);
		int web=Integer.parseInt(msgweb);
		int db=Integer.parseInt(msgdb);
		try {
			dao.tScoreinsert(name, id, java, web, db);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
		RequestDispatcher rd=request.getRequestDispatcher("Teacher/Tscore.jsp");
		response.sendRedirect("Tscore.bit");
		
	}

}
