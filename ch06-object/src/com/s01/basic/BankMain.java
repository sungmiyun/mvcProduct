package com.s01.basic;

class Account{
	/*
	 * [실습]
	 * Account
	 * 1)멤버변수 : 계좌번호(account_num),예금주(name),
	 *            잔고(balance)
	 * 2)멤버메서드 : 예금하기(deposite),출금하기(withdraw)
	 *   예금은 돈이 인자로 전달되어 balance에 누적됨
	 *   출금은 돈이 인자로 전달되어 balance에서 차감됨
	 *   
	 *   계좌정보표시하기(printAccount)
	 *   계좌번호 : 100-1234-678
	 *   예금주 : 홍길동
	 *   잔고 : 20,000원
	 * 
	 * BankMain
	 * Account 객체 생성
	 * 계좌의 기본 정보 입력(계좌번호,예금주,잔고) 
	 * 
	 * 계좌정보 출력
	 * 입금하기 실행
	 * 계좌정보 출력
	 * 출금하기 실행
	 * 계좌정보 출력
	 */
	
	//멤버변수
	String account_num; //계좌번호
	String name;//예금주
	int balance;//잔고
	
	//멤버메서드
	//예금하기
	public void deposite(int money) {
		balance += money; //누적
		System.out.println("입금이 완료되었습니다.");
	}
	//출금하기
	public void withdraw(int money) {
		balance -= money; //차감
		System.out.println("출금이 완료되었습니다.");
	}
	//계좌정보 보기
	public void printAccount() {
		System.out.println("계좌번호 : " + account_num);
		System.out.println("예금주 : " + name);
		System.out.printf("잔고 : %,d원%n", balance);
		System.out.println("---------------");
	}
	
}

public class BankMain {
	public static void main(String[] args) {
		//계좌 생성
		Account account = new Account();
		//계좌 기본 정보 입력
		account.account_num = "101-1234";
		account.name = "홍길동";
		account.balance = 10000;
		
		//계좌 정보 출력
		account.printAccount();
		
		//입금
		account.deposite(20000);
		//계좌 정보 출력
		account.printAccount();
		
		//출금
		account.withdraw(15000);
		//계좌 정보 출력
		account.printAccount();
		
	}
}


