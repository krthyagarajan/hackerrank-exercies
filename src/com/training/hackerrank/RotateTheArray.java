package com.training.hackerrank;

import java.util.Arrays;

public class RotateTheArray {

	public static void main(String[] args) {
		
		Integer[] newArray = rotateTheArray(new Integer[] {1,2,3,4,5,6}, 2);
		Arrays.stream(newArray).forEach(System.out::println);
	}
	
	
	public static Integer[] rotateTheArray(Integer[] array, int steps) {
		
		int arrayLength = array.length;
		
		Integer[] newArray = new Integer[arrayLength];
		
		for(int i = 0; i < arrayLength; i++) {
			int newPosition = findNewPosition(i, steps, arrayLength);
			newArray[newPosition] = array[i];
		}
		return newArray;
		
	}

	private static int findNewPosition(int i, int steps, int arrayLength) {
		int finalPosition = i + steps;
		
		if (finalPosition >= arrayLength ) {
			finalPosition = finalPosition - arrayLength;
		}
		return finalPosition;
	}
}
