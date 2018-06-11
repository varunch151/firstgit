package com.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		 Stream<String> s1 = Stream.of("java", "python", "node", null, "ruby", null, "php");

	       // List<String> result = s1.collect(Collectors.toList());
	       // result.forEach(System.out::println);
		 
		 List<String> l1 = s1.filter(x -> x!=null).collect(Collectors.toList());

	        l1.forEach(System.out::println);

		

	}

}
