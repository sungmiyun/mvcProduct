
public class ArrayMain12 {

	public static void main(String[] args) {
		//2차원 배열
		int test[][]; //2차원 배열 선언
		test = new int[2][3]; //2행 3열
		
		//2차원 배열 초기화
		//[행번호][열변호]
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		
		//배열의 요소를 출력
		System.out.println(test[0][0]);
		System.out.println(test[0][1]);
		System.out.println(test[0][2]);
		
		System.out.println(test[1][0]);
		System.out.println(test[1][1]);
		System.out.println(test[1][2]);
		
		System.out.println("======================");
		
		//반복문을 이용해서 배열의 요소를 출력
		for(int i = 0; i < test.length; i++) { // i : 행번호
			for(int j = 0; j < test[i].length; j++) { // j : 열번호
				System.out.println(("test[" + i + "][" + j + "] : " + test[i][j]));
			}
		}
		
		//배열의 선언 및 생성
		int[][] test2 = new int[2][3];
		
		//배열의 선언, 생성(명시적 배열 생성), 초기화
		int[][] test3 = new int[][] {
									  {10, 20, 30, 40},
									  {50, 60, 70, 80}
									};
		
		//배열의 선언, 생성(암시적 배열 생성), 초기화
		int[][] test4 = {
						  {10, 20, 30},
						  {40, 50, 60},
						  {70, 80, 90}
						};
		
	}

}
