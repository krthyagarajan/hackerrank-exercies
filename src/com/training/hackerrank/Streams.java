package com.training.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		
		String[] str = {"1","2","3","4","5","6"};
		
		List<Integer> evenNumber = Arrays.stream(str)
				.map(s -> Integer.parseInt(s))
				.filter(s -> s % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(evenNumber);
		
		
		evenNumber = Arrays.stream(str).mapToInt(Integer::parseInt).boxed().filter(s -> s % 2 == 0)
			.collect(Collectors.toList());
		System.out.println(evenNumber);
		
	}
}
