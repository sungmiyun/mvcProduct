
public class SwitchMain05 {

	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ���� 2���� �Է��ϰ� ������(+, -, *, /, %)�� �Է��ؼ� ������� ���ϰ�
		 * �� ������� ����Ͻÿ�.
		 * 
		 * [��¿���]
		 * ù��° �� : 10
		 * ������ : -
		 * �ι�° �� : 5
		 * 10 - 5 = 5
		 */
	
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int result = 0, first = 0, second = 0;
		String operator;
		
		System.out.printf("ù��° ���� : ");
		first = input.nextInt();
		System.out.printf("������ : ");
		operator = input.next(); 
		System.out.printf("�ι�° ���� : ");
		second = input.nextInt();
	
		switch(operator) {
		case "+" : result = first + second;
			break;
		case "-" : result = first - second;
			break;
		case "*" : result = first * second;
			break;
		case "/" : 
				if (second == 0) {
					System.out.println("0���� ���� �� �����ϴ�.");
					System.exit(0);
				} else {
					result = first / second;
				}
			break;
		case "%" : 
			if (second == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(0);
			} else {
				result = first % second;
			}	
			break;
		default : System.out.println("���� ���� �������Դϴ�.");
				  System.exit(0);
		}
		
		System.out.printf("%d %s %d = %d", first, operator, second, result);
		
		input.close();
		
		
	}

}
