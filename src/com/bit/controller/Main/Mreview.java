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

import com.bit.model.dao.NoticeDao;
import com.bit.model.dao.ReviewDao;
import com.bit.model.dto.NoticeDto;
import com.bit.model.dto.ReviewDto;

@WebServlet("/Mreview.bit")
public class Mreview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Mreview() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReviewDao dao=new ReviewDao();
		List<ReviewDto> list = null;
		
		try {
			list = dao.mReview();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("review", list);
		RequestDispatcher rd = request.getRequestDispatcher("./Main/Mreview.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
