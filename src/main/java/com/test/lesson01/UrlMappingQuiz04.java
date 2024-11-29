package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz04")
public class UrlMappingQuiz04 extends HttpServlet {

	// 테스트용 주석 추가
	// 임시 내용 추가
	
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		// response header
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		// 출력 & 반복문 
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>리스트</title></head><body><ul>");
		// 1 ~ 30
		for (int i = 1; i <= 30; i++) {
			out.print("<li>" + i + "번째 리스트</li>");
		}
		out.print("</ul></body></html>");
	}
}
