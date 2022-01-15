
public class IfMain08 {

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
		
		if(operator.equals("+")) {
			result = first + second;
		} else if (operator.equals("-")) {
			result = first - second;
		} else if (operator.equals("*")) {
			result = first * second;			
		} else if (operator.equals("/")) {
			if(second != 0 ) {
				result = first / second;
			}else {
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(0);
			}
		} else if (operator.equals("%")) {
			if(second != 0 ) {
				result = first / second;
			}else {
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(0);
			}
			result = first % second;
		} else {
			System.out.println("���� ���� ������ �Դϴ�.");
			System.exit(0);
		}
		
		System.out.println("ù��° �� : " + first);
		System.out.println("������ : " + operator);
		System.out.println("�ι�° �� : " + second);
		System.out.println(first + operator + second + " = " + result);
		
		
		
		input.close();
	}

}
