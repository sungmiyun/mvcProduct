package kr.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;
import kr.board.vo.BoardVO;
import kr.controller.Action;

public class DeleteAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		//전송된 데이터 인코딩 처리
		request.setCharacterEncoding("utf-8");
		
		//전송된 데이터 반환
		int num = Integer.parseInt(request.getParameter("num"));
		String passwd = request.getParameter("passwd");
		
		BoardDAO dao = new BoardDAO();
		//비밀번호 인증
		BoardVO board = dao.getBoard(num);
		boolean check = false;
		if(board != null) {
			//비밀번호 인증, true인 경우 DB에 저장된 비밀번호와 사용자가 입력한 비밀번호가 일치,
			//false인 경우 불일치
			check = board.isCheckedPassword(passwd);
		}
		if(check) {
			//비밀번호 인증 성공
			dao.delete(num); //글 삭제
		}
		request.setAttribute("check", check);
		
		
		
		return "/views/delete.jsp";
	}

}
