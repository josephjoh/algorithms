package com.ohcompany.leetcode;

public class No4MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] A = {1, 2, 3};
		int[] B = {3, 4, 5};
		System.out.println("result >> " + findMedianSortedArrays(A, B));  
	}
	
	public static double findMedianSortedArrays (int[] A, int[] B) {
		int m = A.length;
		int n = B.length;
		if (m > n) {
			int[] temp = A;
			A = B;
			B= temp;
			
			int tmp = m;
			m = n;
			n = tmp;
		}
		int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
		while (iMin <= iMax) {
			int i = (iMin + iMax) / 2;
			int j = halfLen - i;
			if (i < iMax && B[j - 1] > A[i]) {
				System.out.println("B array >> " + B[j -1]);
				System.out.println("B array >> " + A[i]);
				iMin = i + 1;
			} else if (i > iMin && A[i - 1] > B[j]) {
				iMax = i - 1;
			} else {
				int maxLeft = 0;
				if (i == 0) {
					maxLeft = B[j - 1];
				} else if (j == 0) {
					maxLeft = A[i - 1];
				} else {
					maxLeft = Math.max(A[i - 1], B[j - 1]);
				}
				
				if ( (m + n) % 2 == 1) {
					return maxLeft;
				}
				
				int minRight = 0;
				if (i == m) {
					minRight = B[j];
				} else if (j == n) {
					minRight = A[i];
				} else {
					minRight = Math.min(B[j], A[i]);
				}
				return (maxLeft + minRight) / 2.0;
			}
		}
		return 0.0;
	}

}
