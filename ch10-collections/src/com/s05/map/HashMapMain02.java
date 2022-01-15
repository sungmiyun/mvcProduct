package com.s05.map;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapMain02 {
	public static void main(String[] args) {
		String[] msg = {"Belin", "Paris", "Seoul", "New York", "London"};
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		for(int i = 0; i < msg.length; i++) {
			map.put(i, msg[i]);	//key¿Í value ÀúÀå
		}
		
		System.out.println(map);
		System.out.println("========================");
		
		//Set<Integer> s = map.keySet();
		//Iterator<Integer> keys = s.iterator();
		Iterator<Integer> keys = map.keySet().iterator();
		
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(key + ", " + map.get(key));
			
		}
		
		
	}

}
