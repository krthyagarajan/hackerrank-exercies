package com.training.hackerrank;

import java.util.Arrays;

public class MinimumDistanceCalculator {

	
	public static void main(String[] args) {
	
		int[] array = new int[] {7,1,3,4,1,7};
		
		int minDistance = 100001;
		
		for(int i = 0; i < array.length; i++) {
			int iValue = array[i];
			for(int j = i + 1; j < array.length; j++) {
				
				int jValue = array[j];
				
				if(jValue == iValue) {
					int currentDistance = j - i;
					minDistance = Math.min(currentDistance, minDistance);
				} 
				
			}
		}
		
		
//		return minDistance != 100001 ? minDistance : -1 ;
		System.out.println(minDistance != 100001 ? minDistance : -1);
		
		int[] newArray = new int[array.length];
		Arrays.fill(newArray, -1);
		
		
		
		Arrays.stream(array).forEach(System.out::println);
	}
	
	
	
	
}
