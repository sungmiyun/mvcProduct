
public class ArrayMain09 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String[] course = {"����", "����", "����"};
		int[] score = new int[course.length];
		int sum = 0;
		float avg = 0.0f;
		
		//���� �Է�
		for(int i = 0; i < course.length; i++) {
			do {
				System.out.print(course[i] + "=");
				score[i] = input.nextInt();
			}while(score[i] < 0 || score[i] > 100);
			
			//���� ���ϱ�
			sum += score[i];
			
		}
		
		//��ձ��ϱ�
		avg = sum / (float)score.length;
		
		//����, ����, ���� ���� ���
		for(int i = 0; i <score.length; i++) {
			System.out.printf("%s = %d\n", course[i], score[i]);
		}
		
		//����, ��� ���
		System.out.printf("���� = %d\n", sum);
		System.out.printf("��� = %.2f\n",avg);
		
		
		input.close();
	}

}
