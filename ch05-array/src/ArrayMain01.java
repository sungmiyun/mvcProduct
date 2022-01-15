
public class ArrayMain01 {

	public static void main(String[] args) {
		char[] ch; //배열 선언
		ch = new char[4]; //배열 생성
		
		//배열 초기화
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		//배열에 저장된 데이터(요소)
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		
		//반복문을 이용해서 배열의 요소 출력
							//배열의 길이
		for(int i = 0 ; i < ch.length ; i++) {
			System.out.println("ch[" + i + "] : " + ch[i]);
		}
		
		System.out.println("=================");
		
		int it[] = new int[6];
		
		for(int i = 1; i < it.length; i++) {
			System.out.println(it[i]);
		}
		
		System.out.println("=================");
		
		//배열의 선언, 생성(명시적 배열 생성), 초기화
		char[] ch2 = new char[] {'J', 'a', 'v', 'a'};
		
		for(int i = 0; i < ch2.length; i++) {
			System.out.println(ch2[i]);			
		}
		
		//배열의 선언, 생성(암시적 배열 생성), 초기화
		char[] ch3 = {'자', '바'};
		
		
	}

}
