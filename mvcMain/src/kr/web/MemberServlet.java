package kr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member")
public class MemberServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request,
					HttpServletResponse response)
					throws ServletException, IOException{
		//전송된 데이터 인코딩 처리
		request.setCharacterEncoding("utf-8");
		
		//전송된 데이터 반환
		String name = request.getParameter("name");
		String job = request.getParameter("job");
		
		//문서 타입 및 캐릭터셋 지정
		response.setContentType("text/html; charset=utf-8");
		
		//HTML 태그 출력을 위한 출력스트림 생성
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>회원가입</title></head>");
		out.println("<body>");
		out.println("<h1>회원가입</h1>");
		out.println("<p>");
		out.println("이름 : " + name + "<br>");
		out.println("직업 : " + job + "<br>");
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
		//자원정리
		out.close();
		
		
		
	}
}
