package com.training.hackerrank;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MinimumDeletor {

	public static void main(String[] args) {
		int[] array = {36,12,60,99,78,33,4,21,22,9,12,21,34,76,21,3,3,
				37,65,27,21,42,11,14,21,88,46,63,79,6,37,94,99,68,76,6,21,
				86,49,56,22,90,74,83,20,21,94,60,76,75,96,99,92,65,77,26,51,
				21,77,22,97,34,56};
		System.out.println(getMinimumDeletionCount(array));
	}

	private static long getMinimumDeletionCount(int[] input) {

		Map<Integer, Long> map = Arrays.stream(input).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map<Integer, Long> finalMap = new LinkedHashMap<>();
		map.entrySet().stream()
			.sorted(Map.Entry.<Integer, Long>comparingByValue())
			.forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
		System.out.println(finalMap);
		

		return finalMap.values().stream().limit(finalMap.size() - 1).mapToLong(Long ::valueOf).sum();
	}


}
