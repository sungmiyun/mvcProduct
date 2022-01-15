package kr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.action.DeleteAction;
import kr.board.action.DeleteFormAction;
import kr.board.action.DetailAction;
import kr.board.action.ListAction;
import kr.board.action.ModifyAction;
import kr.board.action.ModifyFormAction;
import kr.board.action.WriteAction;
import kr.board.action.WriteFormAction;

@WebServlet("*.do")
public class DispatcharServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,
					  HttpServletResponse response)
					  throws ServletException, IOException{
		requestPro(request, response);
	}
	
	@Override
	public void doPost( HttpServletRequest request,
						HttpServletResponse response)
						throws ServletException, IOException{
		requestPro(request, response);
	}
	
	private void requestPro(HttpServletRequest request,
							HttpServletResponse response) 
							throws ServletException, IOException {
					//		/mvcBoard/list.do
		String command = request.getRequestURI();
		String view = null;
		Action com = null;
		
		if(command.indexOf(request.getContextPath())==0) {
			//��)  /mvcBoard/list.do���� /mvcBoard�� �����ϰ� ������ ���ڿ�(/list.do) ��ȯ
			command = command.substring(request.getContextPath().length());
		}
		
		if(command.equals("/list.do")) {
			//��� ȣ��
			com = new ListAction();
		}else if(command.equals("/writeForm.do")) {
			com = new WriteFormAction();
		}else if(command.equals("/write.do")) {
			com = new WriteAction();
		}else if(command.equals("/detail.do")) {
			com = new DetailAction();
		}else if(command.equals("/modifyForm.do")) {
			com = new ModifyFormAction();
		}else if(command.equals("/modify.do")) {
			com = new ModifyAction();
		}else if(command.equals("/deleteForm.do")) {
			com = new DeleteFormAction();
		}else if(command.equals("/delete.do")) {
			com = new DeleteAction();
		}
		
		//�޼��� ȣ��
		try {
			view = com.execute(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//forward ������� view(jsp) ȣ��
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
		
	}
	
}
