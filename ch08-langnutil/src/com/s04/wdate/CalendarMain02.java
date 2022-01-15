package com.s04.wdate;

import java.util.Calendar;
import java.util.Scanner;


public class CalendarMain02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Calendar 객체 생성
		Calendar cal = Calendar.getInstance();
		
		System.out.println("희망 연도와 월을 입력하세요~ (ex 연도 : 2021, 월 : 1)");
		System.out.print("연도 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		
		System.out.println("    [" + year + "년 " + month + "월]");
		System.out.println("-------------------");
		System.out.println("  일 월  화 수  목  금 토");
		
		//희망하는 연도, 월, 일 세팅
		//월의 범위는 0~11이기 때문에 입력월 - 1,
		//일은 달력이 1일부터 시작하기 때문에 1일로 세팅
		//	     년       월 	   일
		cal.set(year, month-1, 1);
		//1일의 요일을 구함(1 : 일요일 ~ 7 : 토요일)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//월의 마지막 날을 구함
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		
		//공백을 만들어 1일이 실제 요일에 표시되도록 처리
		for(int i = 1; i < week; i++) {
			System.out.printf("%3s", " ");
		}
		
		//1일 ~ 월의 마지막 날짜까지 반복문을 이용해서 표시
		for(int i = 1; i <= lastOfDate; i++) {
			System.out.printf("%3d", i);
			//토요일 다음에 줄바꿈
			if(week % 7 == 0) {
				System.out.println(); //줄바꿈
			}
			week++;
			
		}
		
		
		
		sc.close();
		
	}
}
