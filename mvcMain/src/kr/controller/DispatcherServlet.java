package kr.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.member.action.DeleteAction;
import kr.member.action.ListAction;
import kr.member.action.UpdateAction;
import kr.member.action.WriteAction;
import kr.member.action.WriteFormAction;

@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet{
	@Override
	public void doGet (HttpServletRequest request,
					   HttpServletResponse response) 
					throws ServletException, IOException{
		//���� �۾��� �޼��� ȣ��
		requestPro(request, response);
	}
	
	@Override
	public void doPost (HttpServletRequest request,
						HttpServletResponse response)
						throws ServletException, IOException{
		//���� �۾��� �޼��� ȣ��
		requestPro(request, response);
		
		
	}

	//doGet, doPost�� ȣ���ϴ� ���� �۾��� �޼��� ����
	private void requestPro(HttpServletRequest request,
							HttpServletResponse response)
							throws ServletException, IOException{
		
		String command = request.getRequestURI();
		
		if(command.indexOf(request.getContextPath())==0) {
			command = command.substring(request.getContextPath().length());
		}
		
		//��Ŭ������ ����� ����
		Action com = null;
		//view�� ����� ����
		String view = null;
		
		if(command == null || command.equals("/list.do")) {
			com = new ListAction();
		}else if(command.equals("/write.do")) {
			com = new WriteAction();
		}else if(command.equals("/update.do")) {
			com = new UpdateAction();
		}else if(command.equals("/delete.do")) {
			com = new DeleteAction();
		}else if(command.equals("/writeForm.do")) {
			com = new WriteFormAction();
		}
		
		try {
			//��Ŭ������ execute�޼��带 ������ �����(JSP���)�� ��ȯ ����
			view = com.execute(request, response);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//forward ������� view(jsp)ȣ��
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
		
	}
	
	
}



