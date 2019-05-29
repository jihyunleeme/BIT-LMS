package com.bit.controller.Main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.dao.EduDao;
import com.bit.model.dto.EduDto;


@WebServlet("/Medu.bit")
public class Medu extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Medu() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EduDao dao=new EduDao();
		
		List<EduDto> list=null;
		try {
			list=dao.mEdu();
			request.setAttribute("Medu", list);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	RequestDispatcher rd= request.getRequestDispatcher("Main/Medu.jsp");
    	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
