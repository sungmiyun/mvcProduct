
public class VariableTypeMain01 {

	public static void main(String[] args) {
		
		System.out.println("===����===");
		
		//���� : true, false
		boolean b = true;
		System.out.println("b = " + b);
		
		System.out.println("===������===");
		//������, ũ�� : 2byte, ǥ������ : 0 ~ 65,535
		//�ٱ�� ó���ϱ� ���� �����ڵ�(unicode) ��� ���
		char c1 = 'A'; //���������� �ƽ�Ű�ڵ尪 65
		System.out.println(c1);
		
		char c2 = 65; //A�� �ش�Ǵ� �ƽ�Ű�ڵ尪
		System.out.println(c2);
		
		char c3 = '\u0041'; //A�� �����ڵ尪
		System.out.println(c3);
		
		char c4 = '��';
		System.out.println(c4);
		
		char c5 = '\uc790'; //�ڿ� �ش��ϴ� �����ڵ�
		System.out.println(c5);
		
	}

}
