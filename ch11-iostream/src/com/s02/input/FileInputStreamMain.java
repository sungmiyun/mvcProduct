package com.s02.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamMain {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int readbyte = 0;
		byte[] readbyte2;
		
		try {
			fis = new FileInputStream("file.txt");
			//������ ������ �� ���ھ� �о�鿩 �ƽ�Ű�ڵ�� ��ȯ
			//�����̿��� ���ڴ� ����
			/*
			while((readbyte = fis.read()) != -1 ) {
				System.out.print((char) readbyte);
			}
			*/
			
			//���� �̿��� ���ڵ� ó�� ����
			readbyte2 = new byte[fis.available()];
			//���Ϸκ��� �����͸� �о�鿩 byte �迭�� ����
			fis.read(readbyte2);
							//byte[] -> String���� ��ȯ
			System.out.println(new String(readbyte2));
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			if(fis != null) try {fis.close();} catch(IOException e) {}
		}

	}

}
