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
			//파일의 정보를 한 문자씩 읽어들여 아스키코드로 반환
			//영문이외의 문자는 깨짐
			/*
			while((readbyte = fis.read()) != -1 ) {
				System.out.print((char) readbyte);
			}
			*/
			
			//영문 이외의 문자도 처리 가능
			readbyte2 = new byte[fis.available()];
			//파일로부터 데이터를 읽어들여 byte 배열에 저장
			fis.read(readbyte2);
							//byte[] -> String으로 변환
			System.out.println(new String(readbyte2));
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(fis != null) try {fis.close();} catch(IOException e) {}
		}

	}

}
