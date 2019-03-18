package com.ohcompany.leetcodeArray;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static boolean containDuplicate(int[] nums) {
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					return true;
//				}
//			}
//		}
//		return false;
		
//		Set<Integer> set = new HashSet<Integer>();
//		for (int i : nums) {
//			if (!set.add(i)) {
//				return true;
//			}
//		}
//		return false;
		
		Set<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			if (set.contains(i)) {
				return true;
			}
			set.add(i);
		}
		return false;
	}
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 1};
//		int[] numbers = {1, 2, 3, 4};
		System.out.println(containDuplicate(numbers));
	}

}
