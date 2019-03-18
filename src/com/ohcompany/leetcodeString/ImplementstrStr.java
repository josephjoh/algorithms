package com.ohcompany.leetcodeString;

public class ImplementstrStr {
	
	static int strStr(String haystack, String needle) {
		int l1 = haystack.length();
		int l2 = needle.length();
		if (l1 < l2) {
			return -1;
		} else if (l2 == 0) {
			return 0;
		}
		int threshold = l1 - l2;
		for (int i = 0; i <= threshold; ++i) {
			if (haystack.substring(i,  i + l2).equals(needle)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
//		String input1 = "hello";
//		String input2 = "ll";
		String input1 = "aaaaa";
		String input2 = "bba";
		System.out.println(strStr(input1, input2));
	}

}
