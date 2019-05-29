package com.bit.controller.Main;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bit.model.dao.UsersDao;
import com.bit.model.dto.UsersDto;


@WebServlet("/Login.bit")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Main/Login.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String pw= request.getParameter("pw");
		UsersDto dto=new UsersDto();

		if(id==null) {
			id="id1";
		}
		if(pw==null) {
			pw="pw";
		}
		
		UsersDao dao=new UsersDao();
		try {
			dto=dao.login(id);
			String dbpw=dto.getPw();
			if(dbpw.equals(pw)) {
				HttpSession session = request.getSession();
				session.setAttribute("id", dto.getId());
				session.setAttribute("power", dto.getPower());
				session.setAttribute("name", dto.getName());
				response.sendRedirect("./Main.bit");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
