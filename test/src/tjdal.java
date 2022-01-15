
public class tjdal {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = input.next();
		
		String[] course = {"국어", "영어", "수학", "과학"};
		int[] score = new int[course.length];
		int sum = 0;
		float avg = 0.0f;
		String grade;
		
		for(int i = 0; i < course.length; i++) {
			do {
				System.out.print(course[i] + "=");
				score[i] = input.nextInt();
			}while(score[i] < 0 || score[i] > 100);
			
			sum += score[i];
			
		}
	
		avg = sum / (float)score.length;
	
		switch((int)avg/10) {
		case 10:
		case 9 : grade = "A";
			break;
		case 8 : grade = "B";
			break;
		case 7 : grade = "C";
			break;
		case 6 : grade = "D";
			break;
		default : grade = "F";
		}
		
		
		System.out.printf("이름 = %s\n" , name);
		System.out.printf("국어 점수 : %d\n", score[0]);
		System.out.printf("영어 점수 : %d\n", score[1]);
		System.out.printf("수학 점수 : %d\n", score[2]);
		System.out.printf("과학 점수 : %d\n", score[3]);
		System.out.printf("총점 = %d\n", sum);
		System.out.printf("평균 = %.2f\n",avg);
		System.out.printf("등급 = %s", grade);
		
	
		
		input.close();
		
	}

	
}
