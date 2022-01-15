package com.s08.array;

public class CarMain {
	/*
	 * [실습]
	 * 배열(carArray) 생성, 길이는 4
	 * 총 구매 가격을 저장하는 변수(total)
	 * Car 객체 4개를 생성해서 배열에 저장
	 * 반복문을 이용해서 배열에 저장된 객체 호출, 정보출력
	 * 반복문 내에서 total에 가격을 누적함
	 * 반복문을 빠져나와서 자동차 총 구매 금액을 출력하시오.
	 */
	
	public static void main(String[] args) {
		Car[] carArray = new Car[4];
		int total = 0;
		
		carArray[0] = new Car("레이", "노란색", 100000);
		carArray[1] = new Car("소나타", "빨간색", 500000);
		carArray[2] = new Car("모닝", "검정색", 5000);
		carArray[3] = new Car("그렌져", "파란색", 450000);
		
		for(int i = 0; i < carArray.length; i++) {
			System.out.println("name : " + carArray[i].getName());
			System.out.println("color : " + carArray[i].getColor());
			System.out.println("price : " + carArray[i].getPrice());
			
			System.out.println("---------------------");
			total += carArray[i].getPrice();
		}
		
		System.out.printf("자동차 가격의 합 : %,d\n", total);
		
		System.out.println("====================");
		
		//확장 for문을 이용한 배열의 요소 출력
		for(Car car : carArray) {
			System.out.println("name : " + car.getName());
			System.out.println("color : " + car.getColor());
			System.out.println("price : " + car.getPrice());
			System.out.println("========================");
		}
		
	}
}
