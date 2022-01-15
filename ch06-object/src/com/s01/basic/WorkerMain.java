package com.s01.basic;
class Worker{
	/*
	 * [실습]
	 * 이름(name),돈(money),계좌(balance) 변수 선언
	 * work 메서드는 한 번 실행하면 money에 1000원 누적
	 * 
	 * deposite 메서드는 money의 돈을 balance에 누적시키
	 * money는 0으로 처리
	 * ------------------
	 * 객체를 생성해서
	 * 직원 이름 저장
	 * 10번 일하는데 번 돈이 3000원일 때마다 저축
	 * 직원 이름, money, balance 값 출력
	 */
	//멤버 변수
	String name;
	int money;
	int balance;
	//멤버 메서드
	//일하는 메서드
	public void work() {
		money += 1000;
	}
	//저축하는 메서드
	public void deposite() {
		balance += money;
		money = 0;
	}
}

public class WorkerMain {
	public static void main(String[] args) {
		//객체 선언 및 생성
		Worker worker = new Worker();
		//직원 이름 저장
		worker.name = "홍길동";
		
		//10번 일하는데 번 돈이 3000원일 때마다 저축
		for(int i=1;i<=10;i++) {
			//일하기
			worker.work();
			if(worker.money>=3000) {//worker.money%3000==0
				//저축하기
				worker.deposite();
			}
		}
		
		System.out.println("직원 이름 : " + worker.name);
		System.out.printf(
			 "현재 입금되지 않은 급여 : %,d원%n" , worker.money);
		System.out.printf(
				"통장의 잔고 : %,d원", worker.balance);
	}
}




