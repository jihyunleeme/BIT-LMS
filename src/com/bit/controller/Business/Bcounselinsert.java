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

import com.bit.model.dao.CounselDao;
import com.bit.model.dao.ReplyDao;
import com.bit.model.dto.CounselDto;
import com.bit.model.dto.ReplyDto;

// ���� �¶��λ�� �亯 ����������
@WebServlet("/Bcounselinsert.bit")
public class Bcounselinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Bcounselinsert() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*HttpSession session = request.getSession();
		String name = (String)session.getAttribute("name");
		*/
		
		// �Խñ� Ŭ�� �� �Խñ� �ε��� �� �ޱ�
				String idx=request.getParameter("idx");
				int num=Integer.parseInt(idx);

				CounselDao dao = new CounselDao();
				List<CounselDto> bean = null;
				try {
					bean = dao.mCounselviewdetail(num);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					request.setAttribute("counsel", bean);

				RequestDispatcher rd = request.getRequestDispatcher("./Business/Bcounselinsert.jsp");
				rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String param1 = request.getParameter("contents");
		String param2 = request.getParameter("idx");
		
		/*String param3 = request.getParameter("name");
		String name = param3.trim();*/
		
		int num = Integer.parseInt(param2.trim());
		String cont = param1.trim();
		
		//name �� ���Ƿ� �ֱ�
		String name = "������";
		
		ReplyDao dao = new ReplyDao();
		try {
			dao.bCounselupdate(num, cont, name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("./Bcounsel.bit");
	}

}
