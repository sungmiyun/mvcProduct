
public class CastMain01 {

	public static void main(String[] args) {
		
		System.out.println("===������ ����ȯ(�ڵ� ����ȯ)===");
		
		//�� ū �ڷ������� �°��� �Ͼ�� ����, ������ �ս��� ���� ������ �ڵ������� �߻�
		byte b1 = 127;
		byte b2 = 127;
		
		//32bit �̸� byte�� �����͸� ������ �ϸ� �ڵ����� �ڷ����� int�� ��ȯ�ȴ�.
		int b3 = b1 + b2;
		System.out.println("b3 = " + b3);
		
		short s1 = 3275;
		short s2 = 3456;

		//32bit �̸� short�� �����͸� ������ �ϸ� �ڵ����� �ڷ����� int�� ��ȯ�ȴ�.
		int s3 = s1 + s2; 
		System.out.println("s3 = " + s3);
		
		int in1 = 12345;
		long lg1 = 12345L;
			//int -> long���� �ڵ����� ����ȯ
		long result = in1 + lg1;		
		System.out.println("result = " + result);
		
		int in2 = 35;
		double db1 = 5.8;
			//int -> double�� �ڵ����� ����ȯ
		double result2 = in2 + db1; //35.0 + 5.8
		System.out.println("result2 = " + result2);
		
	}

}
