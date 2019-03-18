package com.ohcompany.leetcodeString;

public class ReverseInteger {
	
	static int reverse(int x) {
//		int result = 0;
//		while (x != 0) {
//			int tail = x % 10;
//			int newResult = result * 10 + tail;
//			if ((newResult - tail) / 10 != result) {
//				return 0;
//			}
//			result = newResult;
//			x = x / 10;
//		}
//		return result;
		
		
		long result =0;
        while (x != 0) {
            result = (result * 10) + (x % 10);
            if(result > Integer.MAX_VALUE) return 0;
            if(result < Integer.MIN_VALUE) return 0;
            x = x/10;
        }
        return (int)result;
	}

	public static void main(String[] args) {
		int input = 123;
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(reverse(input));
	}

}
