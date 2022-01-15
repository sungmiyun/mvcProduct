
public class IfMain01 {

	public static void main(String[] args) {
		System.out.println("===단일 if문===");
		
		int a = 10;
		
		//조건이 true이면 if블럭 안의 수행문을 실행
		if( a > 5) { //if문 시작
			System.out.println("a는 5보다 크다");
						
		} //if문 끝
		
		System.out.println("----------------");
		
		//if문 블럭내의 수행문이 한 줄이면 블럭을 생략할 수 있음
		if(a < 5)
			System.out.println("a는 5보다 작다.");
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		
	}

}
