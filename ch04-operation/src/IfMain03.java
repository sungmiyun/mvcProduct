
public class IfMain03 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("���� �� �� �Է� : ");
		
		int a = input.nextInt();
		
		
		if(a > 0 ) { //���
			System.out.println(a + "�� ����Դϴ�.");
		} else if (a <0) { //����
			System.out.println(a + "�� �����Դϴ�.");
		} else { //0
			System.out.println("0�Դϴ�.");
		}
		
		
		input.close();
				
	}

}
