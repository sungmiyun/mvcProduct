package kr.product.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.controller.Action;
import kr.product.dao.ProductDAO;
import kr.product.vo.ProductVO;

public class ListAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ProductDAO dao = new ProductDAO();
		List<ProductVO> list = dao.getList();
		
		request.setAttribute("list", list);
		
		//JSP경로 반환
		return "/views/list.jsp";
	}

}
