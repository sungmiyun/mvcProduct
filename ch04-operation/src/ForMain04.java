
public class ForMain04 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
		System.out.printf("단을 입력해주세요 : ");
		int dan = input.nextInt();
		
		System.out.println(dan + "단");
		System.out.println("------------------------------");
		
		for (int i = 1 ; i <= 9 ; i++) {	
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
		
		
		
		
		input.close();
		
	}

}


