package com.s05.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			//�����
			//fw = new FileWriter("fileWriter.txt");
			//�̾��
			fw = new FileWriter("fileWriter.txt", true);
			
			
			String message = "�ȳ��ϼ���! FileWriter �׽�Ʈ";
			fw.write(message);//�����͸� ���ۿ� ����
			//���۸� ���� �����͸� ���Ϸ� ����
			fw.flush();
						
			System.out.println("������ �����ϰ� ������ ���");
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			//�ڿ�����
			if(fw != null) try {fw.close();} catch(IOException e) {}
		}
		
		
	}
}
