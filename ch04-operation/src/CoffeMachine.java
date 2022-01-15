
public class CoffeMachine {

	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * Ŀ�Ǹ� �ֹ��ϴ� Ŀ�Ǹӽſ��� Ŀ�Ǹ� �ֹ��ϰ� ���� �����ϸ�
		 * ������ ������ ���� üũ�ؼ� ������ ������ �Ž������� �����ϰ�
		 * ������ �����ϸ� "�Ž����� ����"�̶�� ����ϴ� ���α׷� �ۼ�
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//Ŀ�� ����
		int price = 300;
		//���� �ݾ�
		int amount = 0;
		//���� ����(�Ž�����)
		int coin = 1000;
		
		while(true) {
			System.out.print("1 : Ŀ�Ǹ��ñ�, 2 : ���� => ");
			int num = input.nextInt();
			if(num == 1) {
				System.out.print("�����ӷ� : "); 
				
				//���� �ݾ� �Է�(payment)
				int payment = input.nextInt();
				
				//�Ž�����(change) ����
				int change = payment - price;
				
				//���Աݾ��� ������ ��
				if(payment < price) {
					System.out.println("������ �ݾ��� �����մϴ�!");
					continue;
				}
				
				//�Ž����� ���� ���� üũ
				if(change > coin) {
					//�Ž������� ������ �� ������ "�Ž����� ����"
					System.out.println("�Ž����� ����!");
					continue;
				}
				//�Ž������� ������ �� ������ coin���� change�� ����
				coin -= change;
				//payment�� amount�� ����
				amount += payment;
				//�Ž������� �����
				System.out.printf("�Ž����� : %,d��\n", change);
				System.out.println("Ŀ�ǰ� �غ�Ǿ����ϴ�.");
					
				//���� ���Ǳ� ���� ��� (���� �ݾ�, ���� ���� ���)
				System.out.println("===���� ���Ǳ� ��Ȳ===");
				System.out.printf("�� ������ �ݾ� : %,d��\n", amount);
				System.out.printf("���� ���� : %,d��\n", coin);
				
				System.out.println("===============");
				
			}else if(num == 2) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else {
				System.out.println("�߸��Է��߽��ϴ�.");
				
			}
			
		}
		
		input.close();
	}

}
