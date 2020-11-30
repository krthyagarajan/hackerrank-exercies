package com.training.hackerrank;

public class KangarooJump {

	public String willKangaroosMeet(int pos1, int jump1, int pos2, int jump2) {
		
		if(jump1 == jump2 && pos1 != pos2) return "NO";
		if(jump1 == jump2 && pos1 == pos2) return "YES";
		
		return "NO";
	}
}
