
public class BreakMain03 {

	public static void main(String[] args) {
		//break label�� : break�� �̿��ؼ� ���������� ���ϴ� �ݺ����� �ĺ��ڸ� ����ϰ�
		//               break�� ȣ��� �� break ������ label���� ����ؼ� �����
		
		exit_for: //break label
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				
				//break�� ���Ե� �ݺ����� ��������
				if(j == 3) break exit_for;
				
				System.out.println("i�� : " + i + ", j�� : " + j);
			}
		}
		
		
	}

}
