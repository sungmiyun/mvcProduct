package kr.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.controller.Action;
import kr.member.dao.MemberDAO;
import kr.member.vo.MemberVO;

public class RegisterAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//���۵� ������ ���ڵ� ó��
		request.setCharacterEncoding("UTF-8");
		//�ڹٺ�(VO)��ü ����
		MemberVO member = new MemberVO();
		//���۵� �����͸� �ڹٺ� ����
		member.setId(request.getParameter("id"));
		member.setName(request.getParameter("name"));
		member.setPasswd(request.getParameter("passwd"));
		member.setPhone(request.getParameter("phone"));
		member.setEmail(request.getParameter("email"));
		member.setAddress(request.getParameter("address"));
		
		MemberDAO dao = new MemberDAO();
		dao.insertMember(member);   
		
		
		return "/views/register.jsp";
	}

}
