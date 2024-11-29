package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz01 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		// 한글 깨짐 방지 - response header
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		// 날짜 객체, SimpleDateFormat
		Date now = new Date();
		// 오늘의 날짜는 20XX년 X월 XX일
		out.print("오늘의 날짜는 ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일");
		out.print(sdf.format(now));
	}
}
