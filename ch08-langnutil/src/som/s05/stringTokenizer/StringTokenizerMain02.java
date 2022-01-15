package som.s05.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerMain02 {
	public static void main(String[] args) {
		String souce = "2021-01-12 15:47:30";
		
		StringTokenizer st = new StringTokenizer(souce, "-: ");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}
		
		
		
	}
}
