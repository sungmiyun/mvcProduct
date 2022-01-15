
public class SwitchMain01 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("정수 하나 입력하세요 : ");
		int a = input.nextInt();
		
		switch(a) { //long을 제외한 정수형(byte, short, int)
					//char
		
		case 1 :
			System.out.println("1 입력");
			break; //switch 블럭을 빠져나가는 역할
		case 2 :
			System.out.println("2 입력");
			break;
		case 3 :
			System.out.println("3 입력");
			break;
		default :
			System.out.println("1, 2, 3이 아닌 숫자 입력");
			//break 생략 가능
		
		}
		
		input.close();
		
		
	}

}
