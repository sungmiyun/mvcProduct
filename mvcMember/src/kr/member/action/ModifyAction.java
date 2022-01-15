package kr.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.controller.Action;
import kr.member.dao.MemberDAO;
import kr.member.vo.MemberVO;

public class ModifyAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		Integer user_num = (Integer)session.getAttribute("user_num");
		
		if(user_num == null) {//로그인이 되지 않은 경우
			return "/views/checkLogin.jsp";
		}
		
		//로그인 된 경우
		
		//전송된 데이터 인코딩 처리
		request.setCharacterEncoding("utf-8");
		
		//자바빈(VO) 객체 생성
		MemberVO member = new MemberVO();
		member.setNum(user_num);
		member.setName(request.getParameter("name"));
		member.setPasswd(request.getParameter("passwd"));
		member.setPhone(request.getParameter("phone"));
		member.setEmail(request.getParameter("email"));
		member.setAddress(request.getParameter("address"));
		
		MemberDAO dao = new MemberDAO();
		dao.updateMember(member);
		
		return "/views/modify.jsp";
	}

}
