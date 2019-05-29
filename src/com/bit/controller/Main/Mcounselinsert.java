package com.bit.controller.Main;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.dao.CounselDao;

@WebServlet("/Mcounselinsert.bit")
public class Mcounselinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Mcounselinsert() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Main/Mcounselinsert.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String param1 = request.getParameter("name");
		String param2 = request.getParameter("pw");
		String param3 = request.getParameter("sub");
		String param4 = request.getParameter("contents");
		
		String wuser = param1.trim();
		int pw = Integer.parseInt(param2.trim());
		String sub = param3.trim();
		String cont = param4.trim();
		
		CounselDao dao = new CounselDao();
		try {
			dao.mCounselinsert(sub, cont, wuser, pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("./Mcounselview.bit");
	}

}
