package com.s03.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			//�����
			fos = new FileOutputStream("fileOut.txt");
			
			//�̾��						���ϸ�  , �̾�� ����(true -> �̾��)
			//fos = new FileOutputStream("fileOut.txt", true);
			
			String message = "Hello File ! ���Ͽ� ������ ����ϴ�!";
					//String -> byte[] �迭�� ��ȯ
			fos.write(message.getBytes());
			System.out.println("������ �����ϰ� ������ �����");
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			//�ڿ�����
			if(fos != null) try {fos.close();}catch(IOException e) {}
		}

	}
}
