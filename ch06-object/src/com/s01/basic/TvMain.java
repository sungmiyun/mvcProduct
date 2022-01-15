package com.s01.basic;
class Tv{
	//멤버변수(속성)
	boolean power; //전원상태(on/off)
	int channel; //채널
	
	//멤버메서드(동작)
	public void isPower() {//TV를 커거나 끄는 기능
		power = !power;
	}
	
	public void channelUp() {//TV 채널을 높이는 기능
		++channel;
	}
	
	public void channelDown() {//TV 채널을 낮추는 기능
		--channel;
	}
	
}

public class TvMain {
	public static void main(String[] args) {
		Tv t = new Tv();
		//TV켜기
		t.isPower();//false -> true
		System.out.println("TV 실행 여부 : " + t.power);
		System.out.println("현재 채널 : " + t.channel);
		
		System.out.println("------------------");
		
		//채널 변경
		t.channel = 7;
		System.out.println("첫번째 변경된 채널 : " + t.channel);
		
		System.out.println("------------------");
		
		//채널 변경
		t.channelUp();
		System.out.println("두번째 변경된 채널 : " + t.channel);
		
		System.out.println("------------------");
		
		//TV끄기
		t.isPower();//true -> false
		System.out.println("Tv 실행 여부 : " + t.power);
	}
}





