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
		if(user_num == null) { //�α��ε��� ���� ���
			return "/views/checkLogin.jsp";
		}
		//�α��� �� ���
		//���۵� ������ ���ڵ� ó��
		request.setCharacterEncoding("utf-8");
		
		String passwd = request.getParameter("passwd");
		MemberDAO dao = new MemberDAO();
		MemberVO member = dao.getMember(user_num);
		boolean check = false;
		
		if(member!=null) {
			//��й�ȣ ����
			check = member.isCheckedPassword(passwd);
		}
		if(check) { //���� ����
			//ȸ��Ż��
			dao.deleteMember(user_num);
			//�α׾ƿ�
			session.invalidate();			
		}
		request.setAttribute("check", check);
		
		return "/views/delete.jsp";
	}

}
