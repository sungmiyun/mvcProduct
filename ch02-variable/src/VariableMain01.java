
public class VariableMain01 {
	public static void main(String[] args) {
		
		//변수(Variable)는 값을 저장할 수 있는 메모리의 공간
		
		//변수 선언
		int num;
		
		//변수의 초기화
		num = 17;
		
		//츌력
		System.out.println(num);
		
		//변수 선언 및 초기화
		int number = 20;
		
		//출력
		System.out.println(number);
		
		//데이터 변경
		number = 40;
		
		//변경된 데이터 출력
		System.out.println(number);
		
		//주의사항
		//동일한 변수명으로 변수를 선언하면 오류가 발생한다.
		//int number = 30;
		
		//동일한 자료형을 사용하기 때문에 두번째 변수명 앞의 자료형은 생략
		int a = 10, b = 20;
		int result = a + b;  //연산
		//출력
		System.out.printf("result = %d\n", result);
		
		/*
		 *  + 연산 -> 숫자 + 숫자
		 *  + 연결 -> 문자열 + 숫자   -> 새로운 문자열
		 *           숫자 + 문자열  
		 *           문자열 + 문자열
		 *           
		 */
		System.out.println("result = " + result);
		
		
		//주의사항				문자열 + 숫자 + 숫자 -> 연결
		System.out.println("결과 : " + a + b);
		System.out.println("결과 : " + (a+b)); //연산

		//변수 선언
		int no;
		
		//변수 선언 후 출력 또는 연산하기 전에 반드시 초기화를 해야한다.
		//System.out.println(no);
		
	}

}
