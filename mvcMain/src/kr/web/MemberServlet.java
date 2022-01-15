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
		//���۵� ������ ���ڵ� ó��
		request.setCharacterEncoding("utf-8");
		
		//���۵� ������ ��ȯ
		String name = request.getParameter("name");
		String job = request.getParameter("job");
		
		//���� Ÿ�� �� ĳ���ͼ� ����
		response.setContentType("text/html; charset=utf-8");
		
		//HTML �±� ����� ���� ��½�Ʈ�� ����
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>ȸ������</title></head>");
		out.println("<body>");
		out.println("<h1>ȸ������</h1>");
		out.println("<p>");
		out.println("�̸� : " + name + "<br>");
		out.println("���� : " + job + "<br>");
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
		//�ڿ�����
		out.close();
		
		
		
	}
}
