
public class ArrayMain13 {

	public static void main(String[] args) {
		//2차원 배열 선언, 생성, 초기화
		//2행 4열의 2차원 배열
		int[][] array = {
				{10, 20, 30, 40},
				{50, 60, 70, 80}
			};
		
		//반복문을 이용해서 배열의 요소 출력
		for(int i = 0; i < array.length; i++) {//i : 행번호
			for(int j = 0; j < array.length; j++){ //j : 열번호
				System.out.println(array[i][j]);
			}
		}														
		
	}

}
