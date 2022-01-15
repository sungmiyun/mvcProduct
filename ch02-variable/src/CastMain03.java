
public class CastMain03 {

	public static void main(String[] args) {
		int a = 2;
		char b = 'A';
				//char -> int로 자동적으로 형변환
		int result = a + b; // b->65
		System.out.println("result = " + result);
							//int->char 명시적 형변환
		System.out.println("result = " + (char)result);
		
		
		
		
	}

}
