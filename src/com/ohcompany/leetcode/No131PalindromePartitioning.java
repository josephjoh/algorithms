package com.ohcompany.leetcode;

import java.util.ArrayList;
import java.util.List;

public class No131PalindromePartitioning {
	
//	static List<List<String>> resultLst;
//	static ArrayList<String> currLst;
//	public static List<List<String>> partition(String s) {
//		resultLst = new ArrayList<List<String>>();
//		currLst = new ArrayList<String>();
//		backTrack(s, 0);
//		return resultLst;
//	}
//	public static void backTrack(String s, int l) {
//		if (currLst.size() > 0 && l >= s.length()) {
//			List<String> r = (ArrayList<String>) currLst.clone();
//			resultLst.add(r);
//		}
//		for (int i = l; i < s.length(); i++) {
//			if (isPalindrome(s, l, i)) {
//				if (l == i) {
//					currLst.add(Character.toString(s.charAt(i)));
//				} else {
//					currLst.add(s.substring(l, i+1));
//				}
//				backTrack(s, i + 1);
//				currLst.remove(currLst.size() - 1);
//			}
//		}
//	}
//	public static boolean isPalindrome(String str, int l, int r) {
//		if (l == r) {
//			return true;
//		}
//		while (l < r) {
//			if (str.charAt(l) == str.charAt(r)) {
//				return false;
//			}
//			l++;
//			r--;
//		}
//		return true;
//	}
	
	public static List<List<String>> partition(String s) {
		List<List<String>> res = new ArrayList<>();
		boolean[][] dp = new boolean[s.length()][s.length()];
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j <= i; j++) {
				if (s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j+1][i-1])) {
					dp[j][i] = true;
				}
			}
		}
		helper(res, new ArrayList<>(), dp, s, 0);
		return res;
	}
	
	private static void helper(List<List<String>> res, List<String> path, boolean[][] dp, String s, int pos) {
		if (pos == s.length()) {
			res.add(new ArrayList<>(path));
			return;
		}
		
		for (int i = pos; i < s.length(); i++) {
			if (dp[pos][i]) {
				path.add(s.substring(pos, i + 1));
				helper(res, path, dp, s, i+1);
				path.remove(path.size() - 1);
			}
		}
	}
	

	public static void main(String[] args) {
		String input = "aab";
		System.out.println(partition(input).size()-1);
	}

}
