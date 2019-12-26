package com.slr.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ExpressiveWords {

	public static void main(String[] args) {

		String s ="heeellooo";

		String[] words = {"hello", "hi", "helo"};
		int n = expressiveWords(s, words);
		System.out.println(n);
	}

	public static int expressiveWords(String S, String[] words) {
		char[] c1= S.toCharArray();
		int counter = 0;
		//int j = 0;


		for(String s1 : words) {
			int j = 0;
			char[] c2 = s1.toCharArray();

			for(int i=0; i<c2.length; i++) {
				boolean notMatch = false;
				if(c1[j]!=c2[i]) {
					if((i>0) && (c2[i-1] == c1[j]) && (c2[i-1] == c1[j+1])) {
						j=j+2;
						i--;
					}else {
						notMatch = true;
					}
				}else if(c1[j]==c2[i]) {
					j++;
				}
				if(notMatch) {
					break;
				}else if(j!=c1.length && i == c2.length-1) {
					counter++;
				}

			}


		}
		return counter;
	}
}
