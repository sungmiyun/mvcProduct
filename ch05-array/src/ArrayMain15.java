public class ArrayMain15 {
	public static void main(String[] args) {
		//배열 요소의 정렬
		char[] array = {'z','c','e','a','q'};
		
		//순정렬(사전에 표시된 알파벳 순서로 정렬)
		java.util.Arrays.sort(array);
		//배열의 요소 출력
		for(char ch : array) {
			System.out.print(ch + " ");
		}
		System.out.println("\n-------------");
		
		int[] array2 = {89,39,5,2,1,6,0};
		java.util.Arrays.sort(array2);
		//배열의 요소 출력
		for(int in : array2) {
			System.out.print(in + " ");
		}
		
		
	}
}


