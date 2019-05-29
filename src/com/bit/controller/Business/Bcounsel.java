package com.bit.controller.Business;

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

import com.bit.model.dao.ReplyDao;
import com.bit.model.dto.CounselDto;
import com.bit.model.dto.ReplyDto;
@WebServlet("/Bcounsel.bit")
public class Bcounsel extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Bcounsel() {
        super();
    }
    // �������� �¶��� ��� �Խñ� ��� ��� 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				ReplyDao dao=new ReplyDao();
				// ���������� �������� ����� �Խ���
				List<CounselDto> list = null;
				// ���������� �亯�� ����� �Խ���
				List<ReplyDto> list2 = null;
				
				try {
					list = dao.bCounsel();
					list2 = dao.bGetnum();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				request.setAttribute("counsel", list);
				request.setAttribute("reply", list2);
				RequestDispatcher rd = request.getRequestDispatcher("./Business/Bcounsel.jsp");
				rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
