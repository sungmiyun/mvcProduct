
public class ArrayMain05 {

	public static void main(String[] args) {
		//�迭 ����, ����, �ʱ�ȭ
		int[] array = {10, 20, 30, 40, 50};
		
		//�ݺ����� �̿��� �迭�� ��� ���
		for(int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] : " + array[i]);
		}
		System.out.println("========================");
		
		//������ ����(Ȯ�� for��)
		  //�迭�� ��Ұ� ����Ǵ� ���� : �迭��
		for(int num : array) {
			System.out.println(num);
		}
		
		
		
	}

}
