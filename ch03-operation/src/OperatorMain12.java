
public class OperatorMain12 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int first = input.nextInt();
		
		System.out.print("두번째 정수 : ");
		int second = input.nextInt();
		
		int max = first > second ? first : second;
		System.out.println("max = " + max);
		
		int min = first < second ? first : second;
		System.out.println("min = " + min);
		
		
		
		input.close();
		
	}

}
