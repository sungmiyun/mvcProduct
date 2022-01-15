package kr.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;
import kr.board.vo.BoardVO;
import kr.controller.Action;

public class ModifyFormAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//전송된 글번호 반환
		int num = Integer.parseInt(request.getParameter("num"));
		
		BoardDAO dao = new BoardDAO();
		BoardVO boardVO = dao.getBoard(num);
		
		request.setAttribute("boardVO", boardVO);
				
		//JSP 경로 반환
		return "/views/modifyForm.jsp";
	}

}
