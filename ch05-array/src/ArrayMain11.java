
public class ArrayMain11 {

	public static void main(String[] args) {
		/*
		 * [실습]
		 * 단을 입력받아서 1~9까지 곱해서 값을 구하는데 각각의 값을 
		 * 배열에 저장한 후 출력하시오
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//단 입력
		System.out.printf("단을 입력하세요 : ");
		int dan = input.nextInt();
		
		int[] array = new int[9];
		
		//1부터 9까지 곱해서 결과값을 구하고 배열에 저장
		//저장된 데이터를 출력
		for(int i = 0; i < array.length; i++) {
			array[i] = (i + 1) * dan; //i -> 0~8
			System.out.printf("%d * %d = %d\n",dan, i+1, array[i]);
		}
		
		
		
		
		
		input.close();
		
	}

}
