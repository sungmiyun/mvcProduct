package com.s07.score;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreMain {
	BufferedReader br;
	ArrayList<Score> list;
	
	//������
	public ScoreMain() {
		list = new ArrayList<Score>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			if(br != null) try {br.close();}catch(IOException e) {}
		}
		
	}
	
	//�޴�
	public void callMenu() throws IOException{
		while(true) {
			System.out.printf("1. �����Է��ϱ� 2. ��������ϱ� 3. ���α׷� ���� >");
			try {
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {
					input(); //���� �Է��ϱ�
				}else if(num == 2) {
					output(); //���� ����ϱ�
				}else if(num == 3) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}else {
					System.out.println("�߸��Է��߽��ϴ�..");
				}
				
			}catch(NumberFormatException e){
				System.out.println("���ڸ� �Է��ϼ���.");
			}
			
		}
		
	}
	
	//�����Է�
	public void input() throws IOException{
		Score s = new Score();
		System.out.printf("�̸� : ");
		s.setName(br.readLine());
		
		s.setKorean(parseInputData("���� : "));
		s.setEnglish(parseInputData("���� : "));
		s.setMath(parseInputData("���� : "));
		
		list.add(s);
	}
	
	//�������
	public void output() {
		System.out.println("==========================================================" );
		System.out.printf("�̸�\t��������\t��������\t��������\t����\t���\t���\n");
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
	
	//���� �Է½� 0 ~ 100 ������ �Է��ϴ��� ���� üũ
	public int parseInputData(String cours) throws IOException{
		while(true) {
			System.out.print(cours);
			try{
				int num = Integer.parseInt(br.readLine());
				if(num < 0 || num >= 100) {
					throw new ScoreValueException("0 ~ 100 ������ ���� �����Ѵ�.");
				}
				return num;
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
			}catch(ScoreValueException e ) {
				System.out.println(e.getMessage());
			}
			
			
		}
	}
	
	
	public static void main(String[] args) {
		new ScoreMain();
		
	
	}

}
