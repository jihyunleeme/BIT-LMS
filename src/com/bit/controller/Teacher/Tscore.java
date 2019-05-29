package com.bit.controller.Teacher;

import java.io.IOException;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.dao.ScoreDao;
import com.bit.model.dto.ScoreDto;

@WebServlet("/Tscore.bit")
public class Tscore extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Tscore() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher rd=request.getRequestDispatcher("Teacher/Tscore.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
