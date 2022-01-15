package kr.spring.ch01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		//applicationContext.xml 설정파일을 읽어들여 스프링 컨테이너를 생성
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//@Required 어노테이션을 이용한 필수 프로퍼티 설정
		Camera camera = (Camera)context.getBean("camera1");
		System.out.println(camera);
		
		context.close();
	}
}
