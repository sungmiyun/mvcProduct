
public class tjdal {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = input.next();
		
		String[] course = {"����", "����", "����", "����"};
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
		
		
		System.out.printf("�̸� = %s\n" , name);
		System.out.printf("���� ���� : %d\n", score[0]);
		System.out.printf("���� ���� : %d\n", score[1]);
		System.out.printf("���� ���� : %d\n", score[2]);
		System.out.printf("���� ���� : %d\n", score[3]);
		System.out.printf("���� = %d\n", sum);
		System.out.printf("��� = %.2f\n",avg);
		System.out.printf("��� = %s", grade);
		
	
		
		input.close();
		
	}

	
}
