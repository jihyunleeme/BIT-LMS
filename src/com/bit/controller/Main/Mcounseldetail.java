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

@WebServlet("/Mcounseldetail.bit")
public class Mcounseldetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Mcounseldetail() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// 게시글 클릭 시 게시글 인덱스 값 받기
				String idx=request.getParameter("idx");
				int num=Integer.parseInt(idx);

				CounselDao dao1 = new CounselDao();
				List<CounselDto> bean1 = null;
				try {
					bean1 = dao1.mCounselviewdetail(num);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					request.setAttribute("counsel", bean1);
				
				ReplyDao dao2 = new ReplyDao();
				List<ReplyDto> bean2 = null;
				try {
					bean2 = dao2.bCounselviewdetail(num);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

					request.setAttribute("reply", bean2);
				RequestDispatcher rd = request.getRequestDispatcher("./Main/Mcounseldetail.jsp");
				rd.forward(request, response);
			}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
