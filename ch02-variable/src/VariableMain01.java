
public class VariableMain01 {
	public static void main(String[] args) {
		
		//����(Variable)�� ���� ������ �� �ִ� �޸��� ����
		
		//���� ����
		int num;
		
		//������ �ʱ�ȭ
		num = 17;
		
		//����
		System.out.println(num);
		
		//���� ���� �� �ʱ�ȭ
		int number = 20;
		
		//���
		System.out.println(number);
		
		//������ ����
		number = 40;
		
		//����� ������ ���
		System.out.println(number);
		
		//���ǻ���
		//������ ���������� ������ �����ϸ� ������ �߻��Ѵ�.
		//int number = 30;
		
		//������ �ڷ����� ����ϱ� ������ �ι�° ������ ���� �ڷ����� ����
		int a = 10, b = 20;
		int result = a + b;  //����
		//���
		System.out.printf("result = %d\n", result);
		
		/*
		 *  + ���� -> ���� + ����
		 *  + ���� -> ���ڿ� + ����   -> ���ο� ���ڿ�
		 *           ���� + ���ڿ�  
		 *           ���ڿ� + ���ڿ�
		 *           
		 */
		System.out.println("result = " + result);
		
		
		//���ǻ���				���ڿ� + ���� + ���� -> ����
		System.out.println("��� : " + a + b);
		System.out.println("��� : " + (a+b)); //����

		//���� ����
		int no;
		
		//���� ���� �� ��� �Ǵ� �����ϱ� ���� �ݵ�� �ʱ�ȭ�� �ؾ��Ѵ�.
		//System.out.println(no);
		
	}

}
