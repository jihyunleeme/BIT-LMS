package com.bit.controller.Main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
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

/**
 * Servlet implementation class Mcounselpw
 */
@WebServlet("/Mcounselpw.bit")
public class Mcounselpw extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mcounselpw() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 게시글 클릭 시 게시글 인덱스 값 받기
		String idx=request.getParameter("idx");
		String password = request.getParameter("passwd");
		
		int num=Integer.parseInt(idx.trim());
		int pw=Integer.parseInt(password.trim());
		
		System.out.println(num);
		System.out.println(pw);
		//여기까지 잘나옴
		CounselDao dao1 = new CounselDao();
		
		List<CounselDto> bean1 = null;
		List<CounselDto> bean2 = null;
		
			try {
				bean2 = dao1.mGetpw(num);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		int pwdchk2 =0;
		for(int i=0; i<bean2.size(); i++){
			CounselDto pwdchk = bean2.get(i);
			pwdchk2 = pwdchk.getPw();
		}
		System.out.println("패스워드"+pwdchk2);
		
		
		if(pwdchk2==pw) {
			try {
				bean1 = dao1.mCounselviewdetail(num);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				request.setAttribute("counsel", bean1);
			
			ReplyDao dao3 = new ReplyDao();
			List<ReplyDto> bean3 = null;
			try {
				bean3 = dao3.bCounselviewdetail(num);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

				request.setAttribute("reply", bean3);
			RequestDispatcher rd = request.getRequestDispatcher("./Main/Mcounseldetail.jsp");
			rd.forward(request, response);
		}else{
			response.sendRedirect("./Mcounselview.bit");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
