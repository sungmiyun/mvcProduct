
public class SwitchMain01 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է��ϼ��� : ");
		int a = input.nextInt();
		
		switch(a) { //long�� ������ ������(byte, short, int)
					//char
		
		case 1 :
			System.out.println("1 �Է�");
			break; //switch ���� ���������� ����
		case 2 :
			System.out.println("2 �Է�");
			break;
		case 3 :
			System.out.println("3 �Է�");
			break;
		default :
			System.out.println("1, 2, 3�� �ƴ� ���� �Է�");
			//break ���� ����
		
		}
		
		input.close();
		
		
	}

}
