package com.bit.controller.Admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.dao.UsersDao;
import com.bit.model.dto.UsersDto;

@WebServlet("/Apower.bit")
public class Apower extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Apower() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Admin/Apower.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsersDao dao=new UsersDao();
		UsersDto dto=new UsersDto();
		request.setCharacterEncoding("UTF-8");
		String select=request.getParameter("select");
		System.out.println(select);
		String id=request.getParameter("id");
		if(select!=null) {
			try {
				dto=dao.usersSelect(select);
				request.setAttribute("select", dto);
				RequestDispatcher rd=request.getRequestDispatcher("Admin/Apower.jsp");
				rd.forward(request, response);
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			String power1=request.getParameter("power");
			int power=Integer.parseInt(power1);
			String name=request.getParameter("name");
			System.out.println("권한"+power);
			System.out.println("이름"+name);
			try {
				dao.aPower(power, id);
				RequestDispatcher rd=request.getRequestDispatcher("Admin/Apower.jsp");
				rd.forward(request, response);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				dao.aPower(power, id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
