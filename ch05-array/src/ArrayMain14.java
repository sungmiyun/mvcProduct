public class ArrayMain14 {
	public static void main(String[] args) {
		int[][] score = {
				{99,98,97},
				{96,95,94},
				{93,92,91},
				{90,89,88},
				{87,86,85}
		};
		System.out.println("��ȣ ���� ���� ���� ���� ���");
		System.out.println("------------------------");
		
		for(int i=0;i<score.length;i++) {//���ȣ 0~4
			int sum = 0;
			System.out.print(" " + (i + 1) + " ");
			for(int j=0;j<score[i].length;j++) {//����ȣ 0~2
				//�������ϱ�
				sum += score[i][j];
				//���� ���� ���
				System.out.print(score[i][j] + " ");
			}
			//��� ���ϰ� ������ ��� ���               �����
			System.out.println(sum + " " + sum/score[i].length);
			
		}
	}
}





