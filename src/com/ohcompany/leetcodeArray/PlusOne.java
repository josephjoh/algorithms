package com.ohcompany.leetcodeArray;

public class PlusOne {
	
	static int[] plusOne(int[] digits) {
//		int len = digits.length;
//		int total = 0;
//		int one = digits[len-1] * 1;
//		int ten = digits[len-1] * 10;
//		for (int i = len-1; i <= 0; i--) {
//			total += digits[i] * 1;
//		}
		
		int n = digits.length;
	    for(int i = n-1; i >= 0; i--) {
	        if (digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        digits[i] = 0;
	    }
	    
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    
	    return newNumber;
	}

	public static void main(String[] args) {
//		int[] input = {1, 2, 3};
		int[] input = {9, 9, 9};
		System.out.println(plusOne(input));
	}

}
