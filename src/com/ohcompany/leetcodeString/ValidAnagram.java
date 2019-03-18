package com.ohcompany.leetcodeString;

public class ValidAnagram {
	
	static boolean isAnagram(String s, String t) {
		int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
        	alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
        	alphabet[t.charAt(i) - 'a']--;
        }
        for (int i : alphabet) {
        	if (i != 0) {
        		return false;
        	}
        }
        
        return true;
	}

	public static void main(String[] args) {
		String input1 = "anagram";
		String input2 = "nagaram";
		System.out.println(isAnagram(input1, input2));
	}

}
