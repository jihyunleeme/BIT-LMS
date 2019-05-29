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

import com.bit.model.dao.NoticeDao;
import com.bit.model.dto.NoticeDto;

@WebServlet("/Anotice.bit")
public class Anotice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Anotice() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Admin/Anotice.jsp");
		NoticeDao dao=new NoticeDao();
		List<NoticeDto> list=null;
		
		
		try {
			list=dao.aNotice();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("Anotice", list);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
