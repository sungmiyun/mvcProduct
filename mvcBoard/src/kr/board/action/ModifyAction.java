package kr.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;
import kr.board.vo.BoardVO;
import kr.controller.Action;

public class ModifyAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//���۵� ������ ���ڵ� ó��
		request.setCharacterEncoding("utf-8");
		
		//�ڹٺ�(VO) ��ü ����
		BoardVO boardVO = new BoardVO();
		//request�� ����� �����͸� ��ȯ�޾Ƽ� �ڹٺ� ����
		boardVO.setNum(Integer.parseInt(request.getParameter("num")));
		boardVO.setTitle(request.getParameter("title"));
		boardVO.setName(request.getParameter("name"));
		boardVO.setPasswd(request.getParameter("passwd"));
		boardVO.setEmail(request.getParameter("email"));
		boardVO.setContent(request.getParameter("content"));
		boardVO.setIp(request.getRemoteAddr());
		
		BoardDAO dao = new BoardDAO();
		//��й�ȣ ����
		BoardVO board = dao.getBoard(boardVO.getNum());
		boolean check = false;
		if(board != null) {
			//��й�ȣ ���� ��� true�̸� ��й�ȣ ��ġ, false�̸� ��й�ȣ ����ġ
			check = board.isCheckedPassword(boardVO.getPasswd());
		}
		
		if(check) {
			//�Է��� ��й�ȣ�� DB�� ����� ��й�ȣ�� ��ġ�ϸ� �� ����
			dao.update(boardVO);
		}
		
		request.setAttribute("check", check);
		
		//JSP ��� ��ȯ		
		return "/views/modify.jsp";
	}

}
