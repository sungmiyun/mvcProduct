
public class IfMain06 {

	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ���� �ϳ��� �Է¹޾Ƽ� ¦���̸� 10�� ���ϰ� Ȧ���̸� 20�� ���Ͽ�
		 * ������� ����Ͻÿ�.
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int a = input.nextInt();
		
		if (a % 2 == 0) {
			a = a + 10;
		} else if ( a % 2 == 1) {
			a = a + 20;
		}
		
		System.out.println("����� : " + a);
		
		
		input.close();
		
		
		
	}

}
