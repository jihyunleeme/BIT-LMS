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

import com.bit.model.dao.AttendDao;
import com.bit.model.dto.AttendDto;

@WebServlet("/Aattend.bit")
public class Aattend extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Aattend() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Admin/Aattend.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		AttendDao dao=new AttendDao();
		String name=request.getParameter("name");
		
		
		try {
			List<AttendDto> list =dao.aAttend(name);
			request.setCharacterEncoding("UTF-8");
			request.setAttribute("Aattend", list);
			RequestDispatcher rd=request.getRequestDispatcher("Admin/Aattend.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
}
