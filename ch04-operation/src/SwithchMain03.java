
public class SwithchMain03 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int score;
		char grade;
		
		System.out.print("점수를 입력하세요 : ");
		score = input.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("잘못 입력했습니다.");
			//프로그램 종료
			System.exit(0);
		}
		 
		switch(score/10) { //0 ~ 10
		case 10 :
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		default : grade = 'F';
		}
				
		System.out.printf("점수 : %d\n", score);
		System.out.printf("등급 : %c\n", grade);
		
		
		
		input.close();
	}

}
