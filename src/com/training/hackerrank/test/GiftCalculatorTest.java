package com.training.hackerrank.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.training.hackerrank.GiftCalculator;

class GiftCalculatorTest {

	@Test
	void testGiftCalculator() {
		
		assertEquals(20, GiftCalculator.taumBday(10, 10, 1, 1, 1));
		assertEquals(37, GiftCalculator.taumBday(5, 9, 2, 3, 4));
		assertEquals(12, GiftCalculator.taumBday(3, 6, 9, 1, 1));
		assertEquals(35, GiftCalculator.taumBday(7, 7, 4, 2, 1));
		assertEquals(12, GiftCalculator.taumBday(3, 3, 1, 9, 2));
	}

}
