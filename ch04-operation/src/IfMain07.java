
public class IfMain07 {

	public static void main(String[] args) {
		/*
		 * [실습]
		 * 정수 두 개를 입력 받아서 변수에 저장하고 두 값 중 최대값과 최소값을 구하여
		 * 최대값과 최소값을 출력하시오.
		 * 입력한 두 수가 같을 경우 "두 수는 같다"라고 출력한다.
		 */
		
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int a = input.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int b = input.nextInt();
		
		
		//다중 if문 이용
		if ( a > b) {
			System.out.printf("최대값 : %d, 최소값 : %d\n", a, b);
		} else if (a < b) {
			System.out.printf("최대값 : %d, 최소값 : %d\n", b, a);
		} else {
			System.out.println("두 수는 같다.");
		}
		
		
		//삼항조건식 이용
		if ( a == b) {
			System.out.println("두 수는 같다.");
		} else {
			int max = a > b ? a : b;
			int min = a < b ? a : b;
			System.out.printf("최대값은 %d. 최솟값은 %d \n", max, min);
		}
		
		
		input.close();
		
		
		
		
	}

}
