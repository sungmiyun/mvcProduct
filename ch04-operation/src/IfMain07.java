
public class IfMain07 {

	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ���� �� ���� �Է� �޾Ƽ� ������ �����ϰ� �� �� �� �ִ밪�� �ּҰ��� ���Ͽ�
		 * �ִ밪�� �ּҰ��� ����Ͻÿ�.
		 * �Է��� �� ���� ���� ��� "�� ���� ����"��� ����Ѵ�.
		 */
		
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int a = input.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int b = input.nextInt();
		
		
		//���� if�� �̿�
		if ( a > b) {
			System.out.printf("�ִ밪 : %d, �ּҰ� : %d\n", a, b);
		} else if (a < b) {
			System.out.printf("�ִ밪 : %d, �ּҰ� : %d\n", b, a);
		} else {
			System.out.println("�� ���� ����.");
		}
		
		
		//�������ǽ� �̿�
		if ( a == b) {
			System.out.println("�� ���� ����.");
		} else {
			int max = a > b ? a : b;
			int min = a < b ? a : b;
			System.out.printf("�ִ밪�� %d. �ּڰ��� %d \n", max, min);
		}
		
		
		input.close();
		
		
		
		
	}

}
