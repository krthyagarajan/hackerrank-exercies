package com.training.hackerrank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InfiniteStringTest {

	@Test
	void testInfiniteString() {
		assertEquals(7, InfiniteString.getOccurrences("aba", 10));
	}

}
