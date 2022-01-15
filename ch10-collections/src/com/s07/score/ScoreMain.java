package com.s07.score;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreMain {
	BufferedReader br;
	ArrayList<Score> list;
	
	//생성자
	public ScoreMain() {
		list = new ArrayList<Score>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(br != null) try {br.close();}catch(IOException e) {}
		}
		
	}
	
	//메뉴
	public void callMenu() throws IOException{
		while(true) {
			System.out.printf("1. 성적입력하기 2. 성적출력하기 3. 프로그램 종료 >");
			try {
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {
					input(); //성적 입력하기
				}else if(num == 2) {
					output(); //성적 출력하기
				}else if(num == 3) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}else {
					System.out.println("잘못입력했습니다..");
				}
				
			}catch(NumberFormatException e){
				System.out.println("숫자만 입력하세요.");
			}
			
		}
		
	}
	
	//성적입력
	public void input() throws IOException{
		Score s = new Score();
		System.out.printf("이름 : ");
		s.setName(br.readLine());
		
		s.setKorean(parseInputData("국어 : "));
		s.setEnglish(parseInputData("영어 : "));
		s.setMath(parseInputData("수학 : "));
		
		list.add(s);
	}
	
	//성적출력
	public void output() {
		System.out.println("==========================================================" );
		System.out.printf("이름\t국어점수\t영어점수\t수학점수\t총점\t평균\t등급\n");
		for(Score s : list) {
			System.out.printf("%s\t", s.getName());
			System.out.printf("%d\t", s.getKorean());
			System.out.printf("%d\t", s.getEnglish());
			System.out.printf("%d\t", s.getMath());
			System.out.printf("%d\t", s.makeSum());
			System.out.printf("%.2f\t", s.makeAvg());
			System.out.printf("%s\n", s.makeGrade());
		}
		
	}
	
	//성적 입력시 0 ~ 100 범위로 입력하는지 여부 체크
	public int parseInputData(String cours) throws IOException{
		while(true) {
			System.out.print(cours);
			try{
				int num = Integer.parseInt(br.readLine());
				if(num < 0 || num >= 100) {
					throw new ScoreValueException("0 ~ 100 사이의 값만 인정한다.");
				}
				return num;
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
			}catch(ScoreValueException e ) {
				System.out.println(e.getMessage());
			}
			
			
		}
	}
	
	
	public static void main(String[] args) {
		new ScoreMain();
		
	
	}

}
