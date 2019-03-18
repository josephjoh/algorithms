package com.ohcompany.leetcodeArray;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
//		boolean flag = false;
//		int returnValuie = 0;
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					flag = true;
//				} else {
//					flag = false;
//				}
//				if (!flag) {
//					returnValuie = nums[j];
//				}
//			}
//		}
//		return returnValuie;
		
		int ans = 0;
		
		for (int i = 0; i < nums.length; i++) {
			ans ^= nums[i];
		}
		
		return ans;
	}
	public static void main(String[] args) {
//		int[] numbers = {2,2,1};
		int[] numbers = {4,1,2,1,2};
		System.out.println(singleNumber(numbers));

	}

}
