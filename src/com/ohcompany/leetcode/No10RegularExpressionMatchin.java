package com.ohcompany.leetcode;

enum Result {
	TRUE, FALSE;
}
public class No10RegularExpressionMatchin {

	static Result[][] memo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(isMatch("aabcde", "*a"));
//		System.out.println(isMatchForDP("aabcde", ".*"));
		System.out.println(isMatchForDP2("aabcde", ".*"));
	}
	
//	Using recursion to solve
	public static boolean isMatch (String text, String pattern) {
		if (pattern.isEmpty()) {
			return text.isEmpty();
		}
		boolean first_match = (!text.isEmpty() && 
				(pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));
		
		if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
			return (isMatch(text, pattern.substring(2)) ||
					(first_match && isMatch(text.substring(1), pattern)));
		} else {
			return first_match && isMatch(text.substring(1), pattern.substring(1));
		}
	}
//	Using dynamic programming with top-down variation to solve
	public static boolean isMatchForDP (String text, String pattern) {
		memo = new Result[text.length() + 1][pattern.length() + 1];
		return dp(0, 0, text, pattern);
	}
	public static boolean dp (int i, int j, String text, String pattern) {
		if (memo[i][j] != null) {
			return memo[i][j] == Result.TRUE;
		}
		boolean ans;
		if (j == pattern.length()) {
			ans = i == text.length();
		} else {
			boolean first_match = (i < text.length() &&
					(pattern.charAt(j) == text.charAt(i) ||
					pattern.charAt(j) == '.'));
			if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
				ans = (dp(i, j + 2, text, pattern) ||
						first_match && dp(i + 1, j, text, pattern));
			} else {
				ans = first_match && dp(i + 1, j + 1, text, pattern);
			}
		}
		memo[i][j] = ans ? Result.TRUE : Result.FALSE;
		return ans;
	}
//	Using dynamic programming with bottom-up variation to solve
	public static boolean isMatchForDP2 (String text, String pattern) {
		boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
		dp[text.length()][pattern.length()] = true;
		
		for (int i = text.length(); i >= 0; i--) {
			for (int j = pattern.length() - 1; j >= 0; j--) {
				boolean first_match = (i < text.length() &&
						(pattern.charAt(j) == text.charAt(i) ||
						pattern.charAt(j) == '.'));
				if (j + 1 < pattern.length() && pattern.charAt(j+1) == '*') {
					dp[i][j] = dp[i][j+2] || first_match && dp[i+1][j];
				} else {
					dp[i][j] = first_match && dp[i+1][j+1];
				}
			}
		}
		return dp[0][0];
	}
}


