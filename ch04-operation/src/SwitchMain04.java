
public class SwitchMain04 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.printf("계절을 입력해주세요 : ");
		String season = input.next();
		
		//JDK7.0이상부터 인자값으로 문자열 사용 가능
		switch (season) {
		case "봄" :
			System.out.println("꽃이 피는 계절");
			break;
		case "여름" :
			System.out.println("뜨거운 태양의 계절");
			break;
		case "가을" :
			System.out.println("산들바람이 부는 계절");
			break;
		case "겨울" :
			System.out.println("눈이 내리는 계절");
			break;
		default :
			System.out.println("없는 계절");
		}
		
		
		
		input.close();
	}

}
