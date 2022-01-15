
public class IfMain06 {

	public static void main(String[] args) {
		/*
		 * [실습]
		 * 정수 하나를 입력받아서 짝수이면 10을 더하고 홀수이면 20을 더하여
		 * 결과값을 출력하시오.
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int a = input.nextInt();
		
		if (a % 2 == 0) {
			a = a + 10;
		} else if ( a % 2 == 1) {
			a = a + 20;
		}
		
		System.out.println("결과값 : " + a);
		
		
		input.close();
		
		
		
	}

}
