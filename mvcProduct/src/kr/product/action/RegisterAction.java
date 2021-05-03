package kr.product.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.controller.Action;
import kr.product.dao.ProductDAO;
import kr.product.vo.ProductVO;

public class RegisterAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//���۵� ������ ���ڵ� ó��
		request.setCharacterEncoding("utf-8");
		
		//���۵� �����͸� ��ȯ�޾Ƽ� �ڹٺ� ��ü�� ����
		//�ڹٺ�(VO) ��ü ����
		ProductVO productVO = new ProductVO();
		productVO.setName(request.getParameter("name"));
		productVO.setPrice(Integer.parseInt(request.getParameter("price")));
		productVO.setStock(Integer.parseInt(request.getParameter("stock")));
		productVO.setOrigin(request.getParameter("origin"));
		productVO.setContent(request.getParameter("content"));
		
		//DAO ��ü ����
		ProductDAO dao = new ProductDAO();
		dao.insert(productVO);
		
		return "/views/register.jsp";
	}

}
