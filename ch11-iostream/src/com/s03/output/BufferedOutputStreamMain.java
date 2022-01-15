package com.s03.output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamMain {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("bufferOut.txt");
			bos = new BufferedOutputStream(fos);
			
			String str = "BufferedOutputStream Test �Դϴ�.";
					//String -> byte[]
			bos.write(str.getBytes());
			//���۸� ���� ���ۿ� �ִ� �����͸� ���Ͽ� ���
			//�÷��ø� ���� ������ ���ۿ� ����ִ� �����͸� ���Ͽ� �������� ����
			bos.flush();
			
			System.out.println("������ �����ϰ� ���Ͽ� ���� ���!!");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//BufferedOutputStream�� close �޼���� �ڿ� �����ϱ� ���� buffer��
			//üũ�ؼ� �����ִ� �����Ͱ� ������ flush ó����.
			if(bos != null) try {bos.close();} catch(IOException e) {}
			if(fos != null) try {fos.close();} catch(IOException e) {}
			
			
		}
		
	}
}
