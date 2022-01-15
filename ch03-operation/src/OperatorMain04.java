
public class OperatorMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 국어(korean, 90), 영어(english, 95), 수학(math, 88) 점수를 변수에 초기화하고 
		 * 총점(sum), 평균(avg)을 구하고 국어, 영어, 수학, 총점, 평균을 출력하시오. 
		 */
		
		int korean = 90, english = 95, math = 88;
		
		int sum = korean + english + math;
		int avg = sum / 3;
		
		System.out.printf("국어 점수 : %d\n", korean);
		System.out.printf("영어 점수 : %d\n", english);
		System.out.printf("수학 점수 : %d\n", math);
		System.out.printf("총점 : %d\n" , sum);
		System.out.printf("평균 : %d\n", avg);
		
		
		
		
		
		
	}
}
