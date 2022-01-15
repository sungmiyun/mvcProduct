package com.s04.wdate;

import java.text.DateFormat;	//날짜의 형식을 주는 Format
import java.text.SimpleDateFormat; 
import java.util.Date;

public class DateMain {
	public static void main(String[] args) {
		//java.util.Date
		Date now = new Date();
		System.out.println(now);
		//deprecated되어 사용하지 않음
		System.out.println(now.toLocaleString());
		System.out.println("=============================");
		
		
		
		//java.text.DateFormat
		DateFormat df = DateFormat.getInstance();
		String today = df.format(now);
		System.out.println(today);
		System.out.println("============================");	
		
		df = DateFormat.getDateTimeInstance();
		today = df.format(now);
		System.out.println(today);
		System.out.println("============================");	
		
		df = DateFormat.getDateInstance();
		today = df.format(now);
		System.out.println(today);
		System.out.println("==============================");	
		
		df = DateFormat.getTimeInstance();
		today = df.format(now);
		System.out.println(today);
		System.out.println("===============================");
		
		
		
		//java.text.SimpleDateFormat
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 (E) a hh : mm : ss");
		today = sf.format(now);
		System.out.println(today);
		System.out.println("===============================");
		
		
		
		
	}
}
