
public class ArrayMain11 {

	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ���� �Է¹޾Ƽ� 1~9���� ���ؼ� ���� ���ϴµ� ������ ���� 
		 * �迭�� ������ �� ����Ͻÿ�
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//�� �Է�
		System.out.printf("���� �Է��ϼ��� : ");
		int dan = input.nextInt();
		
		int[] array = new int[9];
		
		//1���� 9���� ���ؼ� ������� ���ϰ� �迭�� ����
		//����� �����͸� ���
		for(int i = 0; i < array.length; i++) {
			array[i] = (i + 1) * dan; //i -> 0~8
			System.out.printf("%d * %d = %d\n",dan, i+1, array[i]);
		}
		
		
		
		
		
		input.close();
		
	}

}
