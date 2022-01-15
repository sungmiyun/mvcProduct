package kr.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.member.action.CheckIDAjaxAction;
import kr.member.action.DeleteAction;
import kr.member.action.DeleteFormAction;
import kr.member.action.LoginAction;
import kr.member.action.LoginFormAction;
import kr.member.action.LogoutAction;
import kr.member.action.MainAction;
import kr.member.action.ModifyAction;
import kr.member.action.ModifyFormAction;
import kr.member.action.MyPageAction;
import kr.member.action.RegisterAction;
import kr.member.action.RegisterFormAction;



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
		
		//------�� Ŭ���� ȣ�� ����------//
		if(command.equals("/main.do")) {
			com = new MainAction();
		}else if(command.equals("/registerForm.do")){
			com = new RegisterFormAction();
		}else if(command.equals("/register.do")) {
			com = new RegisterAction();
		}else if(command.equals("/checkId.do")) {
			com = new CheckIDAjaxAction();
		}else if(command.equals("/loginForm.do")){
			com = new LoginFormAction();
		}else if(command.equals("/login.do")) {
			com = new LoginAction();
		}else if(command.equals("/logout.do")) {
			com = new LogoutAction();
		}else if(command.equals("/myPage.do")) {
			com = new MyPageAction();
		}else if(command.equals("/modifyForm.do")) {
			com = new ModifyFormAction();
		}else if(command.equals("/modify.do")) {
			com = new ModifyAction();
		}else if(command.equals("/deleteForm.do")) {
			com = new DeleteFormAction();
		}else if(command.equals("/delete.do")) {
			com = new DeleteAction();
		}
		//------�� Ŭ���� ȣ�� ��-------//
		
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
