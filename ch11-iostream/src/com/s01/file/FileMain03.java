package com.s01.file;

import java.io.File;


public class FileMain03 {
	public static void main(String[] args) {
		//������
		String path = "c:\\javaWork\\javaSample";
		
		File f1 = new File(path);
		
		System.out.println("===���丮 ����===");
		System.out.println(f1.mkdir());
		
		
		
	}
}
