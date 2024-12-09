package com.test.lesson03;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson03/insert_ex01")
public class InsertEx01 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) {
		
		// response header 세팅 생략(리다이렉트 할 것이기 때문)
		
		// requestParams
		String name = request.getParameter("name");
		String yyyymmdd = request.getParameter("yyyymmdd");
		String email = request.getParameter("email");
		String introduce = request.getParameter("introduce");
		
		// DB 접속
		
		// insert
		
		// DB 접속 해제
		
		// 유저 목록 페이지로 redirect(302)
	}
}



