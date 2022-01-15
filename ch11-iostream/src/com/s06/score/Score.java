package com.s06.score;

public class Score {
	private String name;
	private int korean;
	private int english;
	private int math;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	//총점 구하기 
	public int makeSum() {
		return korean + english + math;
	}
	
	//평균 구하기 
	public double makeAvg() {
		return makeSum() / 3.0;
	}
	
	//등급 구하기
	public String makeGrade() {
		String str;
		switch((int)makeAvg()/10) {
			case 10 :
			case 9 : str = "A";
				break;
			case 8 : str =  "B";
				break;
			case 7 : str = "C";
				break;
			case 6 : str = "D";
				break;
			default : str = "F";
		}
		return str;
	}
	
	
	
}
