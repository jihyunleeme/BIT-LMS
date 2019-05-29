package com.bit.controller.Business;

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

import com.bit.model.dao.CounselDao;
import com.bit.model.dao.ReplyDao;
import com.bit.model.dto.CounselDto;
import com.bit.model.dto.ReplyDto;

@WebServlet("/Bcounseldetail.bit")
public class Bcounseldetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Bcounseldetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*HttpSession session = request.getSession();
		String name = (String)session.getAttribute("name");
		*/
		
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
		RequestDispatcher rd = request.getRequestDispatcher("./Business/Bcounseldetail.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String param1=request.getParameter("contents");
		String param2=request.getParameter("idx");
		
		/*String param3=request.getParameter("name");*/
		int num = 0;
		//////
		String contents=param1.trim();

		/*String name=param3.trim();*/
		
		//String name 임의값주기
		String name = "관리자";
		
		try{
			num = Integer.parseInt(param2);
		}catch(NumberFormatException e){
			doGet(request,response);
			return;
		}
		
		ReplyDao dao = new ReplyDao();
		try {
			dao.bCounselinsert(num, contents, name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("./Bcounsel.bit");
	}

}
