package com.p1;

//패키지 포함해서 클래스를 등록하면
//클래스를 호출때 패키지를 생략하고 클래스를 호출해도 인식
import com.p2.PackTwo;

public class PackMain {
	public static void main(String[] args) {
		//com.p1.PackOne p1 = new com.p1.PackOne();
		//같은 패키지의 클래스는 패키지를 생략하고 클래스만 명시 가능
		PackOne p1 = new PackOne();
		
		//다른 패키지이기 때문에 클래스를 명시할 때 패키지를
		//함께 명시해야 함.
		//com.p2.PackTwo p2 = new com.p2.PackTwo();
		PackTwo p2 = new PackTwo();
	}
}



