
public class ForMain06 {

	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * for���� �̿��ؼ� 1���� 100������ ���� �߿��� 3�� ����� �� ���� ���ϰ� ����Ͻÿ�.
		 */
		
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if(i % 3 == 0) { //3�� ����� ���� ����
				sum += i;
			}	
		}
		System.out.println("��� : " + sum);
		
		
		
		
	}

}
