package com.coding.problems.patterns;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfLetter {

	public static void main(String args[]) {

		String input = "Deepak";

		Map<Character, Integer> result = new LinkedHashMap<>();
		for (int i = 0; i < input.length(); i++) {
			if (result.containsKey(input.charAt(i))) {
				result.put(input.charAt(i), result.get(input.charAt(i)) + 1);
			} else {
				result.put(input.charAt(i), 1);
			}
		}
		System.out.println(result);

	}

}
