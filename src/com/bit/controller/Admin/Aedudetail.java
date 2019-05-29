package com.bit.controller.Admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.dao.EduDao;
import com.bit.model.dao.NoticeDao;
import com.bit.model.dto.EduDto;

@WebServlet("/Aedudetail.bit")
public class Aedudetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Aedudetail() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Admin/Aedudetail.jsp");
		String idx = request.getParameter("idx");
		int num=Integer.parseInt(idx);

		EduDto dto = new EduDto();
		EduDao dao = new EduDao();
		try {
			dto = dao.aEdudetail(num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 확인중!!!
		String msg=dto.getEdu();
		char c= msg.charAt(0);
		char[] arr=msg.toCharArray();
		for(int i=0; i<arr.length; i++) {
			int a=msg.charAt(i);
			System.out.println(a);
		}
		
		request.setAttribute("Aedudetail", dto);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String delete = request.getParameter("delete");//삭제버튼
		String update = request.getParameter("update");//수정버튼
		String list = request.getParameter("list");
		String idx = request.getParameter("idx");
		int num = Integer.parseInt(idx);
		if (list != null) {
			response.sendRedirect("./Aedu.bit");
		} else if (delete != null) {
			EduDao dao=new EduDao();
			try {
				dao.eduDelete(num);
				System.out.println("삭제");
				System.out.println(num);
				response.sendRedirect("./Aedu.bit");
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			} // try end

		} else if (update != null) {
			response.sendRedirect("./Aeduupdate.bit?idx="+num);
		}
	}
}
