package com.bit.controller.Admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.dao.ReviewDao;
import com.bit.model.dto.ReviewDto;

@WebServlet("/Areviewdetail.bit")
public class Areviewdetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Areviewdetail() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Admin/Areviewdetail.jsp");
		String idx=request.getParameter("idx");
		int num=Integer.parseInt(idx);
		ReviewDao dao=new ReviewDao();
		ReviewDto dto=new ReviewDto();
		
		try {
			dto=dao.aReviewdetail(num);
			request.setAttribute("Areviewdetail", dto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String delete=request.getParameter("delete");
		String update=request.getParameter("update");
		String list=request.getParameter("list");
		String idx=request.getParameter("idx");
		int num=Integer.parseInt(idx);
		if(list!=null) {
			response.sendRedirect("./Areview.bit");
		}else if(delete!=null) {
			ReviewDao dao=new ReviewDao();
			System.out.println(num);
			try {
				dao.reviewDelete(num);
				response.sendRedirect("./Areview.bit");
			} catch (SQLException e) {
				e.printStackTrace();
			}//try end
			
		}else if(update!=null) {
			response.sendRedirect("./Areviewupdate.jsp.bit?idx="+num);
		}
	
	
	}

}
