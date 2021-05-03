package kr.product.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.controller.Action;
import kr.product.dao.ProductDAO;
import kr.product.vo.ProductVO;

public class DetailAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int num = Integer.parseInt(request.getParameter("num"));
		
		ProductDAO dao = new ProductDAO();
		ProductVO product = dao.getProduct(num);
		
		request.setAttribute("product", product);

		
		return "/views/detail.jsp";
	}

}
