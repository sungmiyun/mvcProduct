
public class OperatorMain16 {

	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * A���� �븮�������� �׳� ���� �Ǹž��� 15%�� �������ֱ�� �߽��ϴ�.
		 * �Ǹ��� ��ǰ��� ��ǰ�� �ܰ�, ������ Ű����� �Է¹޾Ƽ� ���� �ݾ��� ��½�Ű��
		 * ���α׷��� �ۼ��Ͻÿ�.(��, ��½ÿ��� �Ҽ� ���ϴ� ����)
		 * 
		 * [��� ����]
		 * ��ǰ�� �Է� : �����
		 * �ܰ� �Է� : 500000
		 * �Ǹ� ���� �Է� : 3
		 * ����� 3���� ������ 1,275,000��
		 * 
	     */
			
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.printf("��ǰ���� �Է��ϼ��� : ");
		String product = input.next();
		System.out.printf("�ܰ��� �Է��ϼ��� : ");
		int price = input.nextInt();
		System.out.printf("�Ǹ� ������ �Է��ϼ��� : ");
		int num = input.nextInt();
		
		int sum = price * num;
		double discount = sum * 0.85;
			
		System.out.printf("%s %d���� ������ %,d�� ", product, num, (int)discount);
		
		input.close();
		
			
		
	}

}
