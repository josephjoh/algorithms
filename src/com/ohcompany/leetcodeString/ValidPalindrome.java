package com.ohcompany.leetcodeString;

public class ValidPalindrome {
	
	static boolean isPalindrome(String s) {
		if (s.isEmpty()) {
			return true;
		}
		int head = 0;
		int tail = s.length() - 1;
		char cHead, cTail;
		while (head <= tail) {
			cHead = s.charAt(head);
			cTail = s.charAt(tail);
			if (!Character.isLetterOrDigit(cHead)) {
				head++;
			} else if (!Character.isLetterOrDigit(cTail)) {
				tail--;
			} else {
				if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
					return false;
				}
				head++;
				tail--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
//		String input = "A man, a plan, a canal: Panama";
		String input = "race a car";
		System.out.println(isPalindrome(input));

	}

}
