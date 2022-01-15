public class ArrayMain17 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 정수를 5개 입력 받아서 배열에 보관하고 보관된
		 * 정수 중 최대값과 최소값을 구해서 최대값과 최소값을
		 * 출력하시오
		 */
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		//배열 선언 및 생성
		int[] score = new int[5];
		
		//정수 입력
		for(int i=0;i<score.length;i++) {
			System.out.print("정수 입력:");
			score[i] = input.nextInt();
		}
		
		//정수 5개 입력
		int max = score[0];//배열의 첫번째 값으로 최대값 초기화
		int min = score[0];//배열의 첫번째 값으로 최소값 초기화
		
		//최대값, 최소값 구하기
		for(int i=1;i<score.length;i++) {
			//최대값 구하기
			if(score[i] > max) {
				max = score[i];
			}
			//최소값 구하기
			if(score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		input.close();
	}
}




