
public class OperatorMain05 {

	public static void main(String[] args) {
		/*
		 * [실습]
		 * 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 
		 * 학생당 몇 개를 가질 수 있고, 최종적으로 몇 개가 남는지를 구하시오.
		 * 
		 * [출력예시]
		 * 학생 한 명이 가지는 연필 수 : **
		 * 남은 연필 수 : **
		 * 
		 */
		
		int pencil = 534;
		int student = 30;
		
		System.out.printf("학생 한 명이 가지는 연필 수 : %d\n" , pencil / student);
		System.out.printf("남은 연필 수 : %d\n" , pencil % student);
		
		
		
		
		
	}

}
