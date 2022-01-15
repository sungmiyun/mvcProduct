package kr.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.controller.Action;
import kr.member.dao.MemberDAO;
import kr.member.vo.MemberVO;

public class CheckIDAjaxAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//���۵� ������ ���ڵ� ó��
		request.setCharacterEncoding("UTF-8");
		//���۵� ������ ��ȯ
		String id = request.getParameter("id");
		
		MemberDAO dao = new MemberDAO();
		MemberVO member = dao.checkMember(id);
		String result = null;
		if(member == null) { //���̵� ���ߺ�
			result = "{\"result\":\"idNotFound\"}";
		}else { //���̵� �ߺ�
			result = "{\"result\":\"idDuplicated\"}";
		}
		
		request.setAttribute("result", result);
		
		return "/views/checkId.jsp";
	}

}
