package kr.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.controller.Action;
import kr.member.dao.MemberDAO;
import kr.member.vo.MemberVO;

public class DeleteAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		Integer user_num = (Integer)session.getAttribute("user_num");
		if(user_num == null) { //로그인되지 않은 경우
			return "/views/checkLogin.jsp";
		}
		//로그인 된 경우
		//전송된 데이터 인코딩 처리
		request.setCharacterEncoding("utf-8");
		
		String passwd = request.getParameter("passwd");
		MemberDAO dao = new MemberDAO();
		MemberVO member = dao.getMember(user_num);
		boolean check = false;
		
		if(member!=null) {
			//비밀번호 인증
			check = member.isCheckedPassword(passwd);
		}
		if(check) { //인증 성공
			//회원탈퇴
			dao.deleteMember(user_num);
			//로그아웃
			session.invalidate();			
		}
		request.setAttribute("check", check);
		
		return "/views/delete.jsp";
	}

}
