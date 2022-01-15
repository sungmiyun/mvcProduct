
public class IfMain08 {

	public static void main(String[] args) {
		/*
		 * [실습]
		 * 정수 2개를 입력하고 연산자(+, -, *, /, %)를 입력해서 결과값을 구하고
		 * 그 결과값을 출력하시오.
		 * 
		 * [출력예시]
		 * 첫번째 수 : 10
		 * 연산자 : -
		 * 두번째 수 : 5
		 * 10 - 5 = 5
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int result = 0, first = 0, second = 0;
		String operator;
		
		System.out.printf("첫번째 정수 : ");
		first = input.nextInt();
		System.out.printf("연산자 : ");
		operator = input.next(); 
		System.out.printf("두번째 정수 : ");
		second = input.nextInt();
		
		if(operator.equals("+")) {
			result = first + second;
		} else if (operator.equals("-")) {
			result = first - second;
		} else if (operator.equals("*")) {
			result = first * second;			
		} else if (operator.equals("/")) {
			if(second != 0 ) {
				result = first / second;
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);
			}
		} else if (operator.equals("%")) {
			if(second != 0 ) {
				result = first / second;
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);
			}
			result = first % second;
		} else {
			System.out.println("옳지 않은 연산자 입니다.");
			System.exit(0);
		}
		
		System.out.println("첫번째 수 : " + first);
		System.out.println("연산자 : " + operator);
		System.out.println("두번째 수 : " + second);
		System.out.println(first + operator + second + " = " + result);
		
		
		
		input.close();
	}

}
