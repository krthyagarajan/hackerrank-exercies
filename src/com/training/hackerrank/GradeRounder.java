package com.training.hackerrank;

import java.util.List;
import java.util.stream.Collectors;

public class GradeRounder {

	public static List<Integer> getRoundedNumbers(List<Integer> numbers){
		return numbers.stream().map(GradeRounder::roundNumber).collect(Collectors.toList());
	}
	
	
	private static int roundNumber(int number) {

		if(number % 5 == 0) return number;
		if(number < 38) return number;
		return round(number);
	}

	private static int round(int number) {
		
		int roundedNumber = number;
		
		int remainder = number % 5;
		if(remainder >= 3) {
			int offset = 5 - remainder;
			roundedNumber+= offset;
		} 
		return roundedNumber;
	}

}
