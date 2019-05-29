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

import com.bit.model.dao.CounselDao;
import com.bit.model.dao.ReplyDao;
import com.bit.model.dto.CounselDto;
import com.bit.model.dto.ReplyDto;

@WebServlet("/Mcounselview.bit")
public class Mcounselview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Mcounselview() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CounselDao dao=new CounselDao();
		ReplyDao dao2 = new ReplyDao();
		// 메인페이지 온라인상담 목록게시판
		List<CounselDto> list = null;
		// 영업페이지 답변한 목록 게시판
		List<ReplyDto> list2 = null;
		
		try {
			list = dao.mCounselview();
			list2 = dao2.bGetnum();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("counsel", list);
		request.setAttribute("reply", list2);
		RequestDispatcher rd = request.getRequestDispatcher("./Main/Mcounselview.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
