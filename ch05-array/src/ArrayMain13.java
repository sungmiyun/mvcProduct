
public class ArrayMain13 {

	public static void main(String[] args) {
		//2���� �迭 ����, ����, �ʱ�ȭ
		//2�� 4���� 2���� �迭
		int[][] array = {
				{10, 20, 30, 40},
				{50, 60, 70, 80}
			};
		
		//�ݺ����� �̿��ؼ� �迭�� ��� ���
		for(int i = 0; i < array.length; i++) {//i : ���ȣ
			for(int j = 0; j < array.length; j++){ //j : ����ȣ
				System.out.println(array[i][j]);
			}
		}														
		
	}

}
