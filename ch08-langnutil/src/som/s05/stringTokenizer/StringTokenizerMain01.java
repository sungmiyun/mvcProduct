package som.s05.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerMain01 {
	public static void main(String[] args) {
		String source = "100,200,300,400";
		
		StringTokenizer st = new StringTokenizer(source,",");
		
		//�����ڸ� ���� �߷��� ���ڿ��� �ִ��� ����
		while(st.hasMoreTokens()) { 
			//�����ڸ� ���� �߷��� ���ڿ��� ��ȯ
			System.out.println(st.nextToken());
			
			
		}
		
		
		
	}
}
