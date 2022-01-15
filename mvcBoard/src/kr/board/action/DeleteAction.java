package kr.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;
import kr.board.vo.BoardVO;
import kr.controller.Action;

public class DeleteAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		//���۵� ������ ���ڵ� ó��
		request.setCharacterEncoding("utf-8");
		
		//���۵� ������ ��ȯ
		int num = Integer.parseInt(request.getParameter("num"));
		String passwd = request.getParameter("passwd");
		
		BoardDAO dao = new BoardDAO();
		//��й�ȣ ����
		BoardVO board = dao.getBoard(num);
		boolean check = false;
		if(board != null) {
			//��й�ȣ ����, true�� ��� DB�� ����� ��й�ȣ�� ����ڰ� �Է��� ��й�ȣ�� ��ġ,
			//false�� ��� ����ġ
			check = board.isCheckedPassword(passwd);
		}
		if(check) {
			//��й�ȣ ���� ����
			dao.delete(num); //�� ����
		}
		request.setAttribute("check", check);
		
		
		
		return "/views/delete.jsp";
	}

}
