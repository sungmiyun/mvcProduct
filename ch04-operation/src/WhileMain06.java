
public class WhileMain06 {

	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * Ŀ������������ �Ƹ޸�ī�밡 4,000���Դϴ�.
		 * ���� Ŀ�� ������ ���ϰ� ���� �����ϼ���.
		 * ������ ������ �߻��� �Ž������� ����ϰ� ��ǰ�� �� ��뺸��  ������ ���� ���
		 * ��ǰ�� ������ �� ���� ��� "�ݾ��� �����մϴ�"��� �˷��� ��,
		 * �ٽ� ������ �� �ִ� ���α׷��� �ۼ��Ѵ�.
		 * 
		 * [���࿹��] 
		 * => while���� ���������� ���
		 * ���� ���� �Է� : 2
		 * ���� ������ �ݾ� : 10000
		 * �Ž����� : 2,000��
		 * 
		 * => while���ȿ� �����ִ� ���
		 * ���� ���� �Է� : 2
		 * ���� ������ �ݾ� : 5000
		 * "�ݾ��� �����մϴ�"
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int price = 4000; //Ŀ�� ����
			//���� ����, �Ž�����, ������ �ݾ�, ���� �� �ݾ�
		int quantity, balance, payment, total;
		
		
		while(true) {
			//���� ���� �Է�
			System.out.print("���� ������ �Է��ϼ��� : ");
			quantity = input.nextInt();
			
			//���� ������ �ݾ� �Է�
			System.out.print("������ �ݾ� : ");
			payment = input.nextInt();
			
			//���� �� �ݾ� ���ϱ�
			total = quantity * price;
			
			//�Ž����� ���ϱ�
			balance = payment - total;
			
			//�Ž����� ���� üũ
			if (balance < 0) {
				System.out.printf("%,d���� �����մϴ�. \n", -balance);
			} else {
				break;
			}
			
			
		}
		
		//�Ž����� ���
		System.out.printf("�Ž����� : %,d " , balance);
		
		
		
		
		input.close();
	}

}
