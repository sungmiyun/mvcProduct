
public class OperaotMain08 {

	public static void main(String[] args) {
		//����������, �񱳿�����, ��������
		
		int a,b;
		a = b = 10;
		
		boolean c = a++ >= ++b && ++a > b++;
				//   10    11
				//     false		X
		
		System.out.println(a + " , " + b);
		System.out.println("���� c�� �� : " + c);
		
		
		
		System.out.println("----------------");
		
		
		
		int d, e;
		d = e = 10;
		
		boolean f = ++d < e++ || d++ >= ++e;
				//	11    10 	11      12   
				//    false   || 	false
				//			false
		
		System.out.println(d + " , " + e);
		System.out.println("���� f�� �� : " + f);
		
		
		
 		
		
	}

}
