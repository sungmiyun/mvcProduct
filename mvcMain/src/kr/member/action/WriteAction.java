package kr.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.controller.Action;

public class WriteAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//���۵� ������ ���ڵ� ó��
		request.setCharacterEncoding("utf-8");
		//���۵� ������ ��ȯ
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String job = request.getParameter("job");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		
		
		//request�� ������ ����
		request.setAttribute("name", name);
		request.setAttribute("id", id);
		request.setAttribute("password", password);
		request.setAttribute("job", job);
		request.setAttribute("phone", phone);
		request.setAttribute("address", address);		
		request.setAttribute("message", "ȸ������ ����");
		
		return "/views/write.jsp";
	}
	
}
