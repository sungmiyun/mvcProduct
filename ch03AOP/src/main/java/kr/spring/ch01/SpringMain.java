package kr.spring.ch01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.spring.product.Product;

public class SpringMain {
	public static void main(String[] args) {
		//applicationContext.xml 설정파일을 읽어들여 스프링 컨테이너를 생성
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//핵심 코드가 있는 메서드 실행
		Product p = (Product)context.getBean("product");
		p.launch();
		 
		context.close();
	}
}
