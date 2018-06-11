package com.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("varun");
		l1.add("Ram");
		l1.add("kane");
		l1.add("Hemanth");
		l1.add("varun");
		l1.forEach(x->System.out.println(x)); 
		
		//l1.forEach(System.out::println);// Method reference
		
		System.out.println("===================");
		l1.forEach(x->{
			if("varun".equals(x)) {
				System.out.println(x);
			}
		});
		System.out.println("===================");
		
		l1.stream().filter(x->x.contains("varun")).forEach(System.out::println);
		
		
		
	}
}
