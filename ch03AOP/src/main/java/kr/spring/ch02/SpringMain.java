package kr.spring.ch02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.spring.product.Product;

public class SpringMain {
	public static void main(String[] args) {
		//applicationContextAnnot.xml 설정 파일을 읽어들여 스프링 컨테이너를 생성
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnot.xml");
		
		//핵심코드 실행
		Product p = (Product)context.getBean("product");
		p.launch();
		
		context.close();
	}
}
