package com.bit.controller.Admin;

import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.dao.NoticeDao;
import com.bit.model.dto.NoticeDto;

@WebServlet("/Anoticedetail.bit")
public class Anoticedetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Anoticedetail() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Admin/Anoticedetail.jsp");
		String idx=request.getParameter("idx");
		int num=Integer.parseInt(idx);
		
		NoticeDao dao=new NoticeDao();
		NoticeDto dto=null;
		try {
			dto=dao.aNoticedetail(num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("dto", dto);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String delete=request.getParameter("delete");
		String update=request.getParameter("update");
		String list=request.getParameter("list");
		String idx=request.getParameter("idx");
		int num=Integer.parseInt(idx);
		if(list!=null) {
			response.sendRedirect("./Anotice.bit");
		}else if(delete!=null) {
			NoticeDao dao=new NoticeDao();
			System.out.println(num);
			try {
				dao.noticeDelete(num);
				response.sendRedirect("./Anotice.bit");
			} catch (SQLException e) {
				e.printStackTrace();
			}//try end
			
		}else if(update!=null) {
			response.sendRedirect("./Anoticeupdate.bit?idx="+num);
		}
	}
	}


