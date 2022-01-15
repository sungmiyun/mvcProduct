
public class IfMain05 {

	public static void main(String[] args) {
		
		int a = 10;
		float b = 10.0f;
		
		if(a == b) { //int -> float, 10.0f == 10.0f
			System.out.println("10과 10.0f는 같다");
		}
		
		char c = '0';
		int d = 0;
		
		if (c != d) { //char -> int, 48 != 0
			System.out.println("'0'과 0은 같지 않다.");
		}
		
		char e = 'A';
		int f = 65;
		
		if(e == f) { //char -> int, 65 == 65
			System.out.println("'A'와 65는 같다.");
		}
		
		
		
		
	}

}
