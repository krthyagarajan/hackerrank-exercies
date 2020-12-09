package com.training.hackerrank.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.training.hackerrank.SaveThePrisoner;

class SaveThePrisonerTest {

	@Test
	void testSaveThePrisoner() {
		assertEquals(2,  SaveThePrisoner.saveThePrisoner(5, 2, 1));
		assertEquals(3,  SaveThePrisoner.saveThePrisoner(5, 2, 2));
		assertEquals(6,  SaveThePrisoner.saveThePrisoner(7, 19, 2));
		
		assertEquals(4,  SaveThePrisoner.saveThePrisoner(10, 7, 8));
		assertEquals(3,  SaveThePrisoner.saveThePrisoner(3, 7, 3));
	}

}
