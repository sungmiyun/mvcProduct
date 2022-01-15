package com.s01.file;

import java.io.File;


public class FileMain03 {
	public static void main(String[] args) {
		//절대경로
		String path = "c:\\javaWork\\javaSample";
		
		File f1 = new File(path);
		
		System.out.println("===디렉토리 생성===");
		System.out.println(f1.mkdir());
		
		
		
	}
}
