package kr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/city")
public class CityServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request,
						HttpServletResponse response)
						throws ServletException, IOException{
		//문서 타입 및 캐릭터셋 지정
		response.setContentType("text/html; charset=utf-8");
		
		//HTML 태그 출력을 위한 출력 스트림 생성
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>도시 여행</title></head>");
		out.println("<body>");
		out.println("<h1>도시 여행</h1>");
		out.println("<p>서울에서는 자전거를 이용해서 다양한 여행지를 방문할 수 있습니다.</p>");
		out.println("</body>");
		out.println("</html>");
		//자원정리
		out.close();
	}
}
