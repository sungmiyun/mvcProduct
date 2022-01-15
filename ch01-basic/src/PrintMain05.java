
public class PrintMain05 {
	public static void main(String[] args) {
		/*
		 * System.out.printf(포맷문자, 데이터)를 이용한 출력
		 * (데이터의 종류를 표시랗 수 있는 포맷문자 지원)
		 *  
		 */
		
		//문자		      포맷문자  데이터
		System.out.printf("%c\n", 'A');  // \n : 줄바꿈 특수문자
		System.out.printf("%c%n", '강'); //  %n : 줄바꿈 포맷문자(printf에서만 사용)
		System.out.printf("%c%n", 'X');
		
		System.out.println("----------------");
		
		//정수            포맷문자   데이터
		System.out.printf("%d%n", 67);
		System.out.printf("%,d%n", 10000);

		System.out.println("----------------");
		
		//실수	
		System.out.printf("%f%n", 35.896 );
		System.out.printf("%.3f%n", 35.896 );
		System.out.printf("%.2f%n", 35.896 ); //반올림이 된다
		
		System.out.println("----------------");
		
		//문자열
		System.out.printf("%s%n", "우주");
		
		System.out.println("----------------");
		
		//논리값
		System.out.printf("%b%n", true);
		
		System.out.println("----------------");
	
		//종류가 다른 데이터를 여러개 출력
		System.out.printf("%s는 %d점 입니다.", "점수", 98);
	}
}
