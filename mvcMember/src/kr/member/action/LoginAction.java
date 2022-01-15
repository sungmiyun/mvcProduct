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
		//���۵� ������ ���ڵ� ó��
		request.setCharacterEncoding("UTF-8");
		
		//���۵� ������ ��ȯ
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		MemberDAO dao = new MemberDAO();
		MemberVO member = dao.checkMember(id);
		boolean check = false;
		
		if(member != null) { //id�� ��ϵ� ���
			//��й�ȣ ��ġ ���� üũ
			check = member.isCheckedPassword(passwd);
		}
		if(check) { 
			//����ڰ� �Է��� id�� ��й�ȣ�� DB�� ����� id�� ��й�ȣ�� ��ġ
			//���� ����
			HttpSession session = request.getSession();
			session.setAttribute("user_num", member.getNum());
			session.setAttribute("user_id", member.getId());
		}
		request.setAttribute("check", check);
		
		return "/views/login.jsp";
	}

}
