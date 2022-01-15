package kr.spring.ch04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		//applicationContext.xml 설정파일을 읽어들여 스프링 컨테이너를 생성
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//@Resource 어노테이션을 이용한 프로퍼티 설정
		HomeController home = (HomeController)context.getBean("homeController");
		
		System.out.println(home);
		
		context.close();
	}
}
