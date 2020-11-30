package com.training.hackerrank;

public class SortArray {

	public static void main(String[] args) {
		
		
		//Garbage Collectors
		//Permgen space
//		Executor Framework
		//query to take second highest salary
		//Sort algorithms
		
		int[] array = new int[] {-3,-2,-1};
		
		int[] sortedArray = new int[array.length];
		
		
		for(int value : array) {
			
			int square = value * value;
			populateSortedArray(sortedArray, square);
		}
		
	}

	private static void populateSortedArray(int[] sortedArray, int square) {

		
	}
}