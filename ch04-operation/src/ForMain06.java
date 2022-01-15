
public class ForMain06 {

	public static void main(String[] args) {
		/*
		 * [실습]
		 * for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총 합을 구하고 출력하시오.
		 */
		
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if(i % 3 == 0) { //3의 배수일 때만 누적
				sum += i;
			}	
		}
		System.out.println("결과 : " + sum);
		
		
		
		
	}

}
