package kr.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.controller.Action;
import kr.member.dao.MemberDAO;
import kr.member.vo.MemberVO;

public class LoginAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//전송된 데이터 인코딩 처리
		request.setCharacterEncoding("UTF-8");
		
		//전송된 데이터 반환
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		MemberDAO dao = new MemberDAO();
		MemberVO member = dao.checkMember(id);
		boolean check = false;
		
		if(member != null) { //id가 등록된 경우
			//비밀번호 일치 여부 체크
			check = member.isCheckedPassword(passwd);
		}
		if(check) { 
			//사용자가 입력한 id와 비밀번호가 DB에 저장된 id와 비밀번호와 일치
			//인증 성공
			HttpSession session = request.getSession();
			session.setAttribute("user_num", member.getNum());
			session.setAttribute("user_id", member.getId());
		}
		request.setAttribute("check", check);
		
		return "/views/login.jsp";
	}

}
