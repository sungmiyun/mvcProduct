
public class PrintMain05 {
	public static void main(String[] args) {
		/*
		 * System.out.printf(���˹���, ������)�� �̿��� ���
		 * (�������� ������ ǥ�ö� �� �ִ� ���˹��� ����)
		 *  
		 */
		
		//����		      ���˹���  ������
		System.out.printf("%c\n", 'A');  // \n : �ٹٲ� Ư������
		System.out.printf("%c%n", '��'); //  %n : �ٹٲ� ���˹���(printf������ ���)
		System.out.printf("%c%n", 'X');
		
		System.out.println("----------------");
		
		//����            ���˹���   ������
		System.out.printf("%d%n", 67);
		System.out.printf("%,d%n", 10000);

		System.out.println("----------------");
		
		//�Ǽ�	
		System.out.printf("%f%n", 35.896 );
		System.out.printf("%.3f%n", 35.896 );
		System.out.printf("%.2f%n", 35.896 ); //�ݿø��� �ȴ�
		
		System.out.println("----------------");
		
		//���ڿ�
		System.out.printf("%s%n", "����");
		
		System.out.println("----------------");
		
		//����
		System.out.printf("%b%n", true);
		
		System.out.println("----------------");
	
		//������ �ٸ� �����͸� ������ ���
		System.out.printf("%s�� %d�� �Դϴ�.", "����", 98);
	}
}
