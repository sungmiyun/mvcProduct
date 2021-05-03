package kr.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.product.action.DeleteAction;
import kr.product.action.DeleteFormAction;
import kr.product.action.DetailAction;
import kr.product.action.ListAction;
import kr.product.action.ModifyAction;
import kr.product.action.ModifyFormAction;
import kr.product.action.RegisterAction;
import kr.product.action.RegisterFormAction;


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
			//예)  /mvcBoard/list.do에서 /mvcBoard를 제거하고 나머지 문자열(/list.do) 반환
			command = command.substring(request.getContextPath().length());
		}
		
		//------모델 클래스 호출 시작------//
		if(command.equals("/list.do")) {
			com = new ListAction();
		}else if(command.equals("/registerForm.do")) {
			com = new RegisterFormAction();
		}else if(command.equals("/register.do")) {
			com = new RegisterAction();
		}else if(command.equals("/detail.do")) {
			com = new DetailAction();
		}else if(command.equals("/modifyForm.do")){
			com = new ModifyFormAction();
		}else if(command.equals("/modify.do")) {
			com = new ModifyAction();
		}else if(command.equals("/deleteForm.do")) {
			com = new DeleteFormAction();
		}else if(command.equals("/delete.do")) {
			com = new DeleteAction();
		}
		
		//------모델 클래스 호출 끝-------//
		
		//메서드 호출
		try {
			view = com.execute(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//forward 방식으로 view(jsp) 호출
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
		
	}
	
}
