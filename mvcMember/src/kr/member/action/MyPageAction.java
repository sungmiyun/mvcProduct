package kr.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.controller.Action;
import kr.member.dao.MemberDAO;
import kr.member.vo.MemberVO;

public class MyPageAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		Integer user_num = (Integer)session.getAttribute("user_num");		
		
		if(user_num == null) { //�α����� ���� ���� ���
			return "/views/checkLogin.jsp";
		}
		
		//�α����� �� ���
		MemberDAO dao = new MemberDAO();
		MemberVO member = dao.getMember(user_num);
		
		request.setAttribute("member", member);		
		
		return "/views/myPage.jsp";
	}

}
