package com.ohcompany.leetcodeString;

import java.util.Stack;

public class ReverseString {
	
	static String reverseString(String s) {
//		Stack str = new Stack();
//		char[] word = s.toCharArray();
//		String resultStr = "";
//		for (int i = 0; i < word.length; i++) {
//			str.push(word[i]);
//		}
//		while (!str.isEmpty()) {
//			resultStr += str.pop();
//		}
//		return resultStr;
		
//		char[] word = s.toCharArray();
//		int i = 0;
//		int j = s.length() - 1;
//		while (i < j) {
//			char temp = word[i];
//			word[i] = word[j];
//			word[j] = temp;
//			i++;
//			j--;
//		}
//		return new String(word);
		
		StringBuilder str = new StringBuilder(s);
		str.reverse().toString();
		
		return new StringBuilder(s).reverse().toString();
	}

	public static void main(String[] args) {
		String input = "hello";
//		String input = "A man, a plan, a canal: Panama";
		System.out.println(reverseString(input));
	}

}
