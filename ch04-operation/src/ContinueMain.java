
public class ContinueMain {

	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			
			//Ư�� �����϶� ���๮�� ������ ���߰� ���� �ݺ�ȸ���� �ǳʶ�
			if(i % 3 == 0) //3�� ���
				continue;
			
			System.out.println(i);
		}
	}

}
