
public class OperatorMain15 {

	public static void main(String[] args) {
		
		/* 
		 * [�ǽ�]
		 * 3���� ������ �Է¹޾Ƽ� �ִ밪, �ּҰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * 3���� ������ �����ϴ� ������(first, second, third)
		 * �ִ밪�� �����ϴ� ������(max)
		 * �ּҰ��� �����ϴ� ������(min)
		 * 
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//���� �Է¹ޱ�
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int first = input.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int second = input.nextInt();
		System.out.print("����° ������ �Է��ϼ��� : ");
		int third = input.nextInt();
		
		//�ִ밪 ���ϱ�
		int max = (first > second) ? first : ((second > third) ? second : third);
		System.out.println("�ִ밪�� : " + max);
		
		//�ּҰ� ���ϱ�
		int min = (first < second) ? first : ((second < third) ? second : third);
		System.out.println("�ּҰ��� : " + min);
		
		
		input.close();
		
		
		
		
		
		
		
		
		
		
	}

}
