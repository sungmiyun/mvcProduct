package com.s02.input;

import java.io.IOException;

public class StandardInput02 {
	public static void main(String[] args) {
		
		int input = 0;
		try {
			//ctrl + z를 입력하면 read()메서드가 -1을 반환한다.
			while((input = System.in.read()) != -1) {
				System.out.println(input + ", " + (char)input);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
