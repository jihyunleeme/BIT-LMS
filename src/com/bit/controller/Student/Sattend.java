package com.bit.controller.Student;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import com.bit.model.dao.AttendDao;
import com.bit.model.dto.AttendDto;

@WebServlet("/Sattend.bit")
public class Sattend extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Sattend() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Student/Sattend.jsp");
		
		request.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		String id=(String)session.getAttribute("id");
		
		if(id==null) {
		id="id1";
		}
		
		AttendDao dao=new AttendDao();
		List<AttendDto> list=null;
		try {
			list = dao.sAttend(id);
			System.out.println(list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("Sattend", list);
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
