public class ArrayMain16 {
	public static void main(String[] args) {
		int[] array1 = {11,22,33,44,55};
		int[] array2 = new int[10];
		
		//인자의 의미
		//1 : 원본소스 배열(array1)
		//2 : 원본 소스 배열의 시작 위치(0)
		//3 : 원본 소스가 복사되는 위치(전송처,array2)
		//4 : 전송처 내의 복사 위치(3)
		//5 : 복사되는 배열의 요소의 수(5)
		System.arraycopy(array1, 0, array2, 3, 5);
		
		System.out.println("---원본 배열---");
		for(int in : array1) {
			System.out.print(in + " ");
		}
		
		System.out.println("\n---복사본 배열---");
		for(int in : array2) {
			System.out.print(in + " ");
		}
	}
}



