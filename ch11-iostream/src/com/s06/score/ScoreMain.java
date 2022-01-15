package com.s06.score;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreMain {
	BufferedReader br;
	ArrayList<Score> scoreList;
	
	public ScoreMain() {
		scoreList = new ArrayList<Score>();
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
	public void callMenu() throws IOException {
		while(true) {
			System.out.printf("1. 성적입력하기 2. 성적출력하기 3. 파일 생성 4. 프로그램 종료 >");
			try {
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {
					input(); //성적 입력하기
				}else if(num == 2) {
					output(); //성적 출력하기
				}else if(num == 3) {
					createFile(); //파일 생성하기
				}else if(num == 4) {
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
	
	//성적 입력
	public void input() throws IOException{
		Score s = new Score();
		System.out.printf("이름 : ");
		s.setName(br.readLine());
		
		s.setKorean(parseInputData("국어 : "));
		s.setEnglish(parseInputData("영어 : "));
		s.setMath(parseInputData("수학 : "));
		
		scoreList.add(s);
		
	}
	
	//성적 출력
	public void output() {
		System.out.println("==========================================================" );
		System.out.printf("이름\t국어점수\t영어점수\t수학점수\t총점\t평균\t등급\n");
		for(Score s : scoreList) {
			System.out.printf("%s\t", s.getName());
			System.out.printf("%d\t", s.getKorean());
			System.out.printf("%d\t", s.getEnglish());
			System.out.printf("%d\t", s.getMath());
			System.out.printf("%d\t", s.makeSum());
			System.out.printf("%.2f\t", s.makeAvg());
			System.out.printf("%s\n", s.makeGrade());
		}
		
	}
	
	//파일 생성
	public void createFile() {
		FileWriter fw = null;
		try {
			
			fw = new FileWriter("score.txt");
			fw.write("================================\n");
			fw.write("이름  국어  영어  수학  총점  평균  등급\n");
			fw.write("================================\n");
			
			for(Score s : scoreList) {
				fw.write(s.getName() + "  ");
				fw.write(s.getKorean() + "  ");
				fw.write(s.getEnglish() + "  ");
				fw.write(s.getMath() + "  ");
				fw.write(s.makeSum() + "  ");
				fw.write(String.format("%.2f  ", s.makeAvg()));
				fw.write(s.makeGrade() + "\n");
				fw.flush();
				
			}
			System.out.println("파일을 생성하고 파일에 내용 명시");
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			//자원정리
			if(fw != null) try {fw.close();} catch(IOException e) {}
		}
		
		
	}
	
	//성적 범위 체크(0~100)
	public int parseInputData(String cours) throws IOException{
		while(true) {
			System.out.print(cours);
			try{
				int num = Integer.parseInt(br.readLine());
				if(num < 0 || num > 100) {
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
