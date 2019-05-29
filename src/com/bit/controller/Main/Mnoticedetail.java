package com.bit.controller.Main;

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



@WebServlet("/Mnoticedetail.bit")
public class Mnoticedetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Mnoticedetail() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// 게시글 클릭 시 게시글 인덱스 값 받기
				String idx=request.getParameter("idx");
				int num=Integer.parseInt(idx);

				NoticeDao dao = new NoticeDao();
				NoticeDto bean = null;
				try {
					bean = dao.mNoticedetail(num);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					request.setAttribute("notice", bean);

				RequestDispatcher rd = request.getRequestDispatcher("./Main/Mnoticedetail.jsp");
				rd.forward(request, response);
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
