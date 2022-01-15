package kr.spring.ch12;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		//applicationContext2.xml 설정파일을 읽어들여 스프링 컨테이너를 생성
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//Map 타입 프로퍼티 설정
		ProtocolHandlerFactory protocol = (ProtocolHandlerFactory)context.getBean("protocolHandlerFactory");
		System.out.println(protocol);
		
		context.close();
	}
}
