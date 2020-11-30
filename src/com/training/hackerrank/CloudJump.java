package com.training.hackerrank;

public class CloudJump {

	
	public static int getMinimumJumps(int[] clouds) {
		
		int jumps = 0;
		
		for(int currentIndex = 0 ; currentIndex < clouds.length - 1; ) {
			
			if(currentIndex + 2 >= clouds.length) {
				jumps++;
				break;
			}
			
			if(clouds[currentIndex + 2] == 1) {
				currentIndex++;
			} else {
				currentIndex += 2;
			}
			jumps++;
		}

		return jumps;
	}

}
