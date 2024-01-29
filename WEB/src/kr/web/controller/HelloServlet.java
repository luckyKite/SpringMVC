package kr.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.web.util.MyUtil;

//JavaEE -> Servlet(서블릿)의 골격
public class HelloServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	
		//1 ~ 100까지의 합?
		MyUtil my = new MyUtil();
		int sum = my.hap();
		
		//쵸정한 클라이언트 응답
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println(sum); //5050
		out.println("</body>");
		out.println("</html>");
		
	}
	
}
