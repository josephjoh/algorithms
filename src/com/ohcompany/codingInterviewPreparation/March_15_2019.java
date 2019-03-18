package com.ohcompany.codingInterviewPreparation;

public class March_15_2019 {

	
	private static int countDigit(int number, int target) {
		if (number == 0) return 0;
		
		if (number % 10 == target) {
			return 1 + countDigit(number / 10, target);
		} else {
			return countDigit(number / 10, target);
		}
	}
	
	private static int findMagicIndex(int[] arr, int start, int end) {
		if (start > end) return 0;
		
		int mid = start + (end - start) / 2;
		
		if (arr[mid] == mid) {
			return mid;
		} else if (arr[mid] < mid) {
			return findMagicIndex(arr, mid + 1, end);
		} else {
			return findMagicIndex(arr, start, mid - 1);
		}
	}
	
	private static int countTh(String str, int start, int count) {
		char[] ch = str.toCharArray();
		
		if (start == str.length()) return count;
		
		if (start <= str.length()) {
			if (ch[start] == 't' && ch[start + 1] == 'h') {
				count += 1;
			}	
		}
		
		return countTh(str, start + 1, count);
	}
	
	private static int countWays(int n) {
		if (n == 0) return 1;
		if (n == 1) return 1;
		if (n == 2) return 2;
		
		return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
	}
	
	private static int power(int base, int n) {
		if (n == 0) return 1;
		
		return base * power(base, n - 1);
	}

	
	
	public static void main(String[] args) {
		
		/*
		 * 1)   Given a non-negative int n, and a target single digit, return the count of the occurrences of the target single digit. 
		 * So for example when n is 8218, and target digit is 8, the program shall return 
		 * 2. Do not use iterative (loop) approach but recursive algorithm.
		 * // Hint: mod (%) by 10 yields the rightmost digit ( 912 % 10 is 2), 
		 * while divide (/) by 10 and apply parseInt on its result removes the rightmost digit ( parseInt(587 / 10) is 58 ).
		 */
		System.out.println(countDigit(8218, 8));
		
		
		/*
		 * 2) Compute the value of power function power(x, n), given two integers x (base) and n (exponent, which is non-negative). Use recursion.
		 * // Next, see if you can improve this with branching recursion
		 */
		System.out.println(power(2, 0));
		
		/*
		 * 3)  A magic index in an array[0...n-1] is defined to be an index such that A[i] = i. Given a sorted array of distinct integers, 
		 * write a method to find a magic index. Assume there is always one magic number that exists in array A.
		 */
		int[] inputValue = {-40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13};
		System.out.println(findMagicIndex(inputValue, 0, inputValue.length - 1));
		
		
		/*
		 * 4)  Given a string, compute recursively (no loops) the number of times lowercase "th" appears in the string.
		 */
		System.out.println(countTh("thappleth", 0, 0));
		
		
		/*
		 * 5) A child is running up a staircase with n steps, and can hop either 1 step, 2 steps, or 3 steps at a time.
		 * Implement a method using recursion to count how many possible ways the child can run up the stairs.
		 * Hint: use branching recursion.
		 */
		System.out.println(countWays(3));
		
	}

}
