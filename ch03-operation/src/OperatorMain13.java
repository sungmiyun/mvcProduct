
public class OperatorMain13 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ����(korean), ����(english), ����(math) ������ �Է¹޾Ƽ�
		 * ����(sum), ���(avg)�� ���ϰ� ����, ����, ����, ����, ����� ����Ѵ�.
		 * �ڷ��� : ����, ����, ����, ���� -> int
		 * 		  ��� -> double
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int korean = input.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int english = input.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int math = input.nextInt();
		
		int sum = korean + english + math;
		
		double avg = sum / 3.0;
		
		System.out.println("���� ���� : " + korean);
		System.out.println("���� ���� : " + english);
		System.out.println("���� ���� : " + math);
		System.out.println("���� : " + sum);
		System.out.printf("��� : %.2f\n" , avg);
				
		
		input.close();
		
		
		
	}
}
