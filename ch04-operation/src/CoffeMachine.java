
public class CoffeMachine {

	public static void main(String[] args) {
		/*
		 * [실습]
		 * 커피를 주문하는 커피머신에서 커피를 주문하고 돈을 지불하면
		 * 보유한 동전의 양을 체크해서 동전이 있으면 거스름돈을 지불하고
		 * 동전이 부족하면 "거스름돈 부족"이라고 출력하는 프로그램 작성
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//커피 가격
		int price = 300;
		//보유 금액
		int amount = 0;
		//보유 동전(거스름돈)
		int coin = 1000;
		
		while(true) {
			System.out.print("1 : 커피마시기, 2 : 종료 => ");
			int num = input.nextInt();
			if(num == 1) {
				System.out.print("동전임력 : "); 
				
				//지불 금액 입력(payment)
				int payment = input.nextInt();
				
				//거스름돈(change) 연산
				int change = payment - price;
				
				//투입금액이 부족할 때
				if(payment < price) {
					System.out.println("투입한 금액이 부족합니다!");
					continue;
				}
				
				//거스름돈 지불 여부 체크
				if(change > coin) {
					//거스름돈을 지불할 수 없으면 "거스름돈 부족"
					System.out.println("거스름돈 부족!");
					continue;
				}
				//거스름돈을 지불할 수 있으면 coin에서 change를 차감
				coin -= change;
				//payment를 amount에 누적
				amount += payment;
				//거스름돈을 출력함
				System.out.printf("거스름돈 : %,d원\n", change);
				System.out.println("커피가 준비되었습니다.");
					
				//현재 자판기 정보 출력 (보유 금액, 보유 동전 출력)
				System.out.println("===현재 자판기 상황===");
				System.out.printf("총 투입한 금액 : %,d원\n", amount);
				System.out.printf("보유 동전 : %,d원\n", coin);
				
				System.out.println("===============");
				
			}else if(num == 2) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못입력했습니다.");
				
			}
			
		}
		
		input.close();
	}

}
