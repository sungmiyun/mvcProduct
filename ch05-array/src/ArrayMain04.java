
public class ArrayMain04 {

	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95}; //0~6
		
		int max = score[0]; //�迭�� ù��° ������ ���ذ� ����
		int min = score[0]; //�迭�� ù��° ������ ���ذ� ����
		
		//�ݺ����� �̿��ؼ� �迭�� ��Ҹ� ȣ��
		for(int i = 1; i < score.length; i++) {
			//�ִ밪 ���ϱ�
			if(score[i] > max) {
				max = score[i];
			}
			//�ּҰ� ���ϱ�
			if(score[i] < min) {
				min = score[i];
			}
		}
		
		//�ִ밪�� �ּҰ� ���
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
		
		
		
	}

}
