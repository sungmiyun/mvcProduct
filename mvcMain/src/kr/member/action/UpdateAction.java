package kr.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.controller.Action;

public class UpdateAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//request�� ������ ����
		request.setAttribute("message", "ȸ�� ���� ����");
		//JSP��� ��ȯ		
		return "/views/update.jsp";
	}
	
}
