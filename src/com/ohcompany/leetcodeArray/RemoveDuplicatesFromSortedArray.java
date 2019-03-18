package com.ohcompany.leetcodeArray;

class Solution {
//	public static int removeDuplicates(int[] A) {
//	    if (A.length == 0) return 0;
//	    int j = 0;
//	    for (int i = 0; i < A.length; i++) {
//	    	if (A[i] != A[j]) {
//	    		A[++j] = A[i];
//	    	}
//	    }
//	    return ++j;
//	}
}

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int [] intArray = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		int result = removeDuplicates(intArray);
		System.out.println("result > " + result);
	}

	private static int removeDuplicates(int[] A) {
		if (A.length == 0) return 0;
	    int j = 0;
	    for (int i = 0; i < A.length; i++) {
	    	if (A[i] != A[j]) {
	    		A[++j] = A[i];
	    	}
	    }
	    return ++j;
	}
}
