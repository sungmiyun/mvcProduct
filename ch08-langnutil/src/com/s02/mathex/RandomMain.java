package com.s02.mathex;

import java.util.Random;

public class RandomMain {
	public static void main(String[] args) {
		String[] gift = {"스마트폰", "TV", "냉장고", "꽝" };
						//  0		1		2	  3	
		
		//0.0 ~ 1.0 미만의 난수 발생
		double ran = Math.random();
		System.out.println("발생한 난수 : " + ran);
		
		int index = (int)(ran * 4); // 0 ~ 3
		System.out.println("발생한 난수 : " + index);
		System.out.println("오늘의 선물 : " + gift[index]);
		
		System.out.println("=============================");
		
		String[] luck = {"로또당첨", "즐거운 여행", "맛집 투어", "피곤해~~"};
						// 	0		1			2			3
		Random r1 = new Random();
		
		//0부터 인자로 전달된 값의 전까지의 범위로 난수를 발생
		index = r1.nextInt(4);	//0 ~ 3
		System.out.println("발생한 난수 : " + index);
		System.out.println("오늘의 운세 : " + luck[index]);
		
	
	}
}
