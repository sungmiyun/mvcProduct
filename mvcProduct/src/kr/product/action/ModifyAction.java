package kr.product.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.controller.Action;
import kr.product.dao.ProductDAO;
import kr.product.vo.ProductVO;

public class ModifyAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		
		//자바빈 객체 생성
		ProductVO product = new ProductVO();
		//request에 저장된 값을 반환받아서 자바빈에 저장
		product.setNum(Integer.parseInt(request.getParameter("num")));
		product.setName(request.getParameter("name"));
		product.setPrice(Integer.parseInt(request.getParameter("price")));
		product.setStock(Integer.parseInt(request.getParameter("stock")));
		product.setOrigin(request.getParameter("origin"));
		product.setContent(request.getParameter("content"));
		
		ProductDAO dao = new ProductDAO();
		dao.update(product);
		
		
		return "/views/modify.jsp";
	}

}
