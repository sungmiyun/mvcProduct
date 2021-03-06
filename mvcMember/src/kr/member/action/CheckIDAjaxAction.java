package kr.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.controller.Action;
import kr.member.dao.MemberDAO;
import kr.member.vo.MemberVO;

public class CheckIDAjaxAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//전송된 데이터 인코딩 처리
		request.setCharacterEncoding("UTF-8");
		//전송된 데이터 반환
		String id = request.getParameter("id");
		
		MemberDAO dao = new MemberDAO();
		MemberVO member = dao.checkMember(id);
		String result = null;
		if(member == null) { //아이디 미중복
			result = "{\"result\":\"idNotFound\"}";
		}else { //아이디 중복
			result = "{\"result\":\"idDuplicated\"}";
		}
		
		request.setAttribute("result", result);
		
		return "/views/checkId.jsp";
	}

}
