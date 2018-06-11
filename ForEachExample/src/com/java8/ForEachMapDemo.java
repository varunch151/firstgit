package com.java8;

import java.util.HashMap;
import java.util.Map;


public class ForEachMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<>();
		m1.put("varun", 101);
		m1.put("ram", 102);
		m1.put("hemanth", 103);
		m1.put("nandu", 104);
		
	m1.forEach((k,v)->System.out.println(k +"="+ v));
		m1.forEach((k,v)->{
			
		System.out.println(k +"="+ v);
		if("varun".equals(k)) {
			System.out.println("varun");
		  }
		});
				

	}

}
