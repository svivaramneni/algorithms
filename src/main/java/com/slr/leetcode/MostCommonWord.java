package com.slr.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/most-common-word/
 */
public class MostCommonWord {

	public static void main(String[] args) {

		System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
	}

	public static String mostCommonWord(String paragraph, String[] banned) {

		Set<String> bannedWords = new HashSet<>();

		for (String word : banned) {
			bannedWords.add(word.toLowerCase());
		}

		String[] words = paragraph.replaceAll("[^a-zA-z ]", "").toLowerCase().split(" ");

		Map<String, Integer> countsMap = new HashMap<>();
		for (String word : words) {
			if (!bannedWords.contains(word)) {
				countsMap.put(word, countsMap.getOrDefault(word, 0) + 1);
			}
		}

		String result = "";
		for (String key : countsMap.keySet()) {
			if (result.equals("") || countsMap.get(key) > countsMap.get(result)) {
				result = key;
			}
		}

		return result;
	}

}
