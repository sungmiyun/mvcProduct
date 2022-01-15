package com.s05.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			//덮어쓰기
			//fw = new FileWriter("fileWriter.txt");
			//이어쓰기
			fw = new FileWriter("fileWriter.txt", true);
			
			
			String message = "안녕하세요! FileWriter 테스트";
			fw.write(message);//데이터를 버퍼에 저장
			//버퍼를 비우고 데이터를 파일로 전송
			fw.flush();
						
			System.out.println("파일을 생성하고 내용을 명시");
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			//자원정리
			if(fw != null) try {fw.close();} catch(IOException e) {}
		}
		
		
	}
}
