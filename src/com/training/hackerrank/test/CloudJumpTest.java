package com.training.hackerrank.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.training.hackerrank.CloudJump;

class CloudJumpTest {

	@Test
	void testJumps() {
		assertEquals(4, CloudJump.getMinimumJumps(new int[] {0,0,1,0,0,1,0}));
		assertEquals(3, CloudJump.getMinimumJumps(new int[] {0,0,0,0,0,1,0}));
		assertEquals(3, CloudJump.getMinimumJumps(new int[] {0,0,0,1,0,0}));
	}
	
}
