
public class ArrayMain03 {

	public static void main(String[] args) {
		//�迭�� ����, ����(�Ͻ��� �迭 ����), �ʱ�ȭ
		int[] score = {100, 88, 88,100,90};
		int sum = 0;
		float average = 0.0f;
		
		//�ݺ����� �̿��ؼ� �迭�� ��Ҹ� ȣ��
		for(int i = 0; i < score.length; i++) {
			// ���� ���ϱ� (����)
			sum += score[i];
		}
		
		//��� ���ϱ�
		//average = sum / 5.0F;
		average = sum / (float)score.length;
		
		System.out.printf("���� : %d\n", sum);
		System.out.printf("��� : %.2f", average);
		
		
		
		
	}

}
