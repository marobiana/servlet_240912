package com.test.lesson03;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson03/quiz02_delete")
public class DeleteQuiz02 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		// request param -> id
		int id = Integer.parseInt(request.getParameter("id"));
		
		// DB 접속
		MysqlService mysqlService = MysqlService.getInstance(); 
		mysqlService.connect();
		
		// delete
		String deleteQuery = "delete from `bookmark` where `id`=" + id;
		try {
			mysqlService.update(deleteQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB 접속 해제
		mysqlService.disconnect();
		
		// 리다이렉트 => 목록
		response.sendRedirect("/lesson03/quiz02_list.jsp");
	}
}
