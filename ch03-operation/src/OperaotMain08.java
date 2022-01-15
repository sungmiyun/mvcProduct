
public class OperaotMain08 {

	public static void main(String[] args) {
		//증감연산자, 비교연산자, 논리연산자
		
		int a,b;
		a = b = 10;
		
		boolean c = a++ >= ++b && ++a > b++;
				//   10    11
				//     false		X
		
		System.out.println(a + " , " + b);
		System.out.println("변수 c의 값 : " + c);
		
		
		
		System.out.println("----------------");
		
		
		
		int d, e;
		d = e = 10;
		
		boolean f = ++d < e++ || d++ >= ++e;
				//	11    10 	11      12   
				//    false   || 	false
				//			false
		
		System.out.println(d + " , " + e);
		System.out.println("변수 f의 값 : " + f);
		
		
		
 		
		
	}

}
