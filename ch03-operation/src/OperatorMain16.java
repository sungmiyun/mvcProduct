
public class OperatorMain16 {

	public static void main(String[] args) {
		/*
		 * [실습]
		 * A전자 대리점에서는 그날 물건 판매액의 15%를 할인해주기로 했습니다.
		 * 판매한 상품명과 상품의 단가, 수량을 키보드로 입력받아서 지불 금액을 출력시키는
		 * 프로그램을 작성하시오.(단, 출력시에는 소수 이하는 절삭)
		 * 
		 * [출력 예시]
		 * 상품명 입력 : 냉장고
		 * 단가 입력 : 500000
		 * 판매 수량 입력 : 3
		 * 냉장고 3대의 가격은 1,275,000원
		 * 
	     */
			
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.printf("상품명을 입력하세요 : ");
		String product = input.next();
		System.out.printf("단가를 입력하세요 : ");
		int price = input.nextInt();
		System.out.printf("판매 수량을 입력하세요 : ");
		int num = input.nextInt();
		
		int sum = price * num;
		double discount = sum * 0.85;
			
		System.out.printf("%s %d개의 가격은 %,d원 ", product, num, (int)discount);
		
		input.close();
		
			
		
	}

}
