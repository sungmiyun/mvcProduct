
public class ArrayMain04 {

	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95}; //0~6
		
		int max = score[0]; //배열의 첫번째 값으로 기준값 설정
		int min = score[0]; //배열의 첫번째 값으로 기준값 설정
		
		//반복문을 이용해서 배열의 요소를 호출
		for(int i = 1; i < score.length; i++) {
			//최대값 구하기
			if(score[i] > max) {
				max = score[i];
			}
			//최소값 구하기
			if(score[i] < min) {
				min = score[i];
			}
		}
		
		//최대값과 최소값 출력
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
		
	}

}
