
public class ArrayMain01 {

	public static void main(String[] args) {
		char[] ch; //�迭 ����
		ch = new char[4]; //�迭 ����
		
		//�迭 �ʱ�ȭ
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		//�迭�� ����� ������(���)
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		
		//�ݺ����� �̿��ؼ� �迭�� ��� ���
							//�迭�� ����
		for(int i = 0 ; i < ch.length ; i++) {
			System.out.println("ch[" + i + "] : " + ch[i]);
		}
		
		System.out.println("=================");
		
		int it[] = new int[6];
		
		for(int i = 1; i < it.length; i++) {
			System.out.println(it[i]);
		}
		
		System.out.println("=================");
		
		//�迭�� ����, ����(����� �迭 ����), �ʱ�ȭ
		char[] ch2 = new char[] {'J', 'a', 'v', 'a'};
		
		for(int i = 0; i < ch2.length; i++) {
			System.out.println(ch2[i]);			
		}
		
		//�迭�� ����, ����(�Ͻ��� �迭 ����), �ʱ�ȭ
		char[] ch3 = {'��', '��'};
		
		
	}

}
