package com.slr.heap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class HeapDS {

	public static void main(String[] args) {

		List<Integer> dataArray = new ArrayList<>();
		dataArray.add(1);
		dataArray.add(3);
		dataArray.add(9);
		dataArray.add(12);
		dataArray.add(13);

		//removeElementFromMinHeap(dataArray, 0);
		System.out.println(isValid("()"));
	}

	private static void removeElementFromMinHeap(List<Integer> dataArray, int elementIndex) {

		int size = dataArray.size();

		if(elementIndex >= size) {
			throw new IllegalArgumentException("Element index should be in the array range");
		}
		dataArray.set(elementIndex, dataArray.get(size-1));

		//SwapElementsBasedOnHeapInvariant
		reOrderHeap(dataArray, elementIndex);
	}

	/*public int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int max = 0;
		int j=0;
		for(int i =0; i< s.length(); i++) {
			if(map.get(s.cchartAt(i)) !=null) {
				j = Math.max(j, s.chartAt(i)+1);
			}
			map.put(s.chart(i), i);
			max = Math.max(max, i-j+1);
		}
		return max;
	}*/

	public static boolean isValid(String s) {
		char[] chars = s.toCharArray();

		int brackets = 0, array=0, curley=0;

		Stack<Character> st = new Stack<>();

		/*for(int i =0; i<chars.length; i++) {
			switch(chars[i]) {
				case '(': st.push(chars[i]);
					break;
				case ')': if(Character.compare((, st.pop())==0)
					return false;
				case '[': st.push(chars[i]);
					break;
				case ']': if('[' != st.pop())
					return false;
				case '{': st.push(chars[i]);
					break;
				case '}': if('{' == st.pop())
					return false;
			}
		}
		if(st.size()==0){
			return true;
		}*/
		return false;

	}

	private static void reOrderHeap(List<Integer> dataArray, int elementIndex) {
		Map<Character, Integer> map = new HashMap<>();
	}/*{

		while (heap)

		int parentIndex = (elementIndex-1)/2;
		int leftChildIndex = elementIndex*2 + 1;

		if(dataArray.get(elementIndex) < dataArray.get(parentIndex)) {
			int temp = dataArray.get(parentIndex);
			dataArray.set(parentIndex, dataArray.get(elementIndex)) ;
			dataArray.set(elementIndex, temp);
			reOrderHeap(dataArray, parentIndex);
		}else if()
	}*/


}
