package com.s04.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {
	public static void main(String[] args) {
		FileReader fr = null;
		int readChar;
		try {
			fr = new FileReader("file.txt");
			//���Ϸκ��� �����͸� �� ���ھ� �о�鿩 �����ڵ�� ��ȯ
			while((readChar = fr.read()) != -1) {
				System.out.print((char)readChar);
				
				
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			if(fr != null) try {fr.close();} catch(IOException e) {}
		}
		
		
		
	}
}
