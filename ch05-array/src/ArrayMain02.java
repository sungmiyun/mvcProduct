
public class ArrayMain02 {

	public static void main(String[] args) {
		//�迭 ���� �� ����
		int[] array = new int[5];
		
		//�迭�� �����ϸ� �迭�� ��ҷ� �ڷ����� �⺻���� �����
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		System.out.println("==================");
		
		//�迭�� ��� ����
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		//�ݺ����� �̿��� �迭�� ��� ���
		for(int i = 0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
		
	}

}
