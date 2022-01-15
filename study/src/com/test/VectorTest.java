package com.test;

import java.util.Collections;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		while(v.size() < 6) {
			int num = (int)(Math.random() * 45) + 1;
		
			if(!v.contains(num)) {
				v.add(num);
			}
			
		}
		
		Collections.sort(v);
		
		System.out.println(v);
		
		
	}
}
