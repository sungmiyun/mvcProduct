
public class OperatorMain13 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 국어(korean), 영어(english), 수학(math) 성적을 입력받아서
		 * 총점(sum), 평균(avg)을 구하고 국어, 영어, 수학, 총점, 평균을 출력한다.
		 * 자료형 : 국어, 영어, 수학, 총점 -> int
		 * 		  평균 -> double
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int korean = input.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int english = input.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		int math = input.nextInt();
		
		int sum = korean + english + math;
		
		double avg = sum / 3.0;
		
		System.out.println("국어 점수 : " + korean);
		System.out.println("영어 점수 : " + english);
		System.out.println("수학 점수 : " + math);
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f\n" , avg);
				
		
		input.close();
		
		
		
	}
}
