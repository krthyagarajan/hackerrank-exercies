package com.training.hackerrank.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.training.hackerrank.GradeRounder;

class GradeRounderTest {

	@Test
	void testRoundNumber() {
		
//		assertEquals(50, GradeRounder.roundNumber(50));
//		assertEquals(33, GradeRounder.roundNumber(33));
//		assertEquals(75, GradeRounder.roundNumber(73));
//		assertEquals(67, GradeRounder.roundNumber(67));
//		assertEquals(40, GradeRounder.roundNumber(38));
		
		
		List<Integer> numbers = Arrays.asList(73,67,38,33,50);
		
		List<Integer> roundedList = GradeRounder.getRoundedNumbers(numbers);
		assertEquals(75, roundedList.get(0));
		assertEquals(67, roundedList.get(1));
		assertEquals(40, roundedList.get(2));
		assertEquals(33, roundedList.get(3));
		assertEquals(50, roundedList.get(4));
		
		
		
		
	}

}
