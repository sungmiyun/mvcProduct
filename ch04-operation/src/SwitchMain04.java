
public class SwitchMain04 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.printf("������ �Է����ּ��� : ");
		String season = input.next();
		
		//JDK7.0�̻���� ���ڰ����� ���ڿ� ��� ����
		switch (season) {
		case "��" :
			System.out.println("���� �Ǵ� ����");
			break;
		case "����" :
			System.out.println("�߰ſ� �¾��� ����");
			break;
		case "����" :
			System.out.println("���ٶ��� �δ� ����");
			break;
		case "�ܿ�" :
			System.out.println("���� ������ ����");
			break;
		default :
			System.out.println("���� ����");
		}
		
		
		
		input.close();
	}

}
