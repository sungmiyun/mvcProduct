package som.s05.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerMain01 {
	public static void main(String[] args) {
		String source = "100,200,300,400";
		
		StringTokenizer st = new StringTokenizer(source,",");
		
		//구분자를 통해 잘려진 문자열이 있는지 검증
		while(st.hasMoreTokens()) { 
			//구분자를 통해 잘려진 문자열을 반환
			System.out.println(st.nextToken());
			
			
		}
		
		
		
	}
}
