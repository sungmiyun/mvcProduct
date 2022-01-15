package com.s06.score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclEntry;
import java.util.Iterator;

public class ScoreMain {
	private BufferedReader br;
	private ScoreDAO dao;
	
	
	public ScoreMain() {
		dao = new ScoreDAO();
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			callMenu();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br != null) try {br.close();} catch(IOException e) {}
		}
	}
	
	public void callMenu()throws IOException{
		while(true) {
			System.out.print("1. �Է� 2. ��� 3. ������ 4. ���� 5. ���� 6. ���� : ");
			try {
				int no = Integer.parseInt(br.readLine());
				
				if(no == 1) {//�Է�
					System.out.println("������ �Է��մϴ�.");
					System.out.print("�̸� : ");
					String name = br.readLine();
					System.out.print("���� : ");
					int korean = Integer.parseInt(br.readLine());
					System.out.print("���� : ");
					int english = Integer.parseInt(br.readLine());
					System.out.print("���� : ");
					int math = Integer.parseInt(br.readLine());
					
					ScoreVO vo = new ScoreVO();
					vo.setName(name);
					vo.setKorean(korean);
					vo.setEnglish(english);
					vo.setMath(math);
					
					dao.insertInfo(vo);
					
				} else if(no == 2) {//���
					dao.selectInfo();
				} else if(no == 3) {//������
					System.out.printf("��ȣ�� �Է��Ͻÿ� : ");
					int num = Integer.parseInt(br.readLine());
					dao.selectDetailInfo(num);
				} else if(no == 4) {//����
					System.out.print("��ȣ�� �Է��ϼ��� : ");
					int num = Integer.parseInt(br.readLine());
					System.out.print("�̸� : ");
					String name = br.readLine();
					System.out.print("���� : ");
					int korean = Integer.parseInt(br.readLine());
					System.out.print("���� : ");
					int english = Integer.parseInt(br.readLine());
					System.out.print("���� : ");
					int math = Integer.parseInt(br.readLine());
					
					ScoreVO vo = new ScoreVO();
					vo.setNum(num);
					vo.setName(name);
					vo.setKorean(korean);
					vo.setEnglish(english);
					vo.setMath(math);
			
					dao.updateInfo(vo);
				} else if(no == 5) {//����
					//num ���� �Է¹���
					System.out.print("��ȣ�� �Է��ϼ��� : ");
					int num = Integer.parseInt(br.readLine());
					dao.delteInfo(num);
					
				} else if(no == 6) {//����
					System.out.println("���α׷� ����");
					break;
				} else {
					System.out.println("�߸� �Է��߽��ϴ�.");
				}
				
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է� ����!!");
			}
			
		}
	}
	
	public static void main(String[] args) {
		new ScoreMain();
		
	}

}
