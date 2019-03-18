package com.ohcompany.leetcodeArray;

import java.util.HashMap;
import java.util.Map;

class Solution1 {
	public int[] twoSum(int[] nums, int target) {
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (target == nums[i] + nums[j]) {
//					return new int[] {i, j};
//				}
//			}
//		}
//		throw new IllegalArgumentException("No two sum solution");
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i1 = 0; i1 < nums.length; i1++) {
			Integer i2 = map.get(target - nums[i1]);
			if (i2 != null && i1 != i2) {
				return new int[] {i1, i2};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
		
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (int i = 0; i < nums.length; i++) {
//			if (map.containsKey(target - nums[i])) {
//				return new int [] {map.get(target - nums[i]), i};
//			}
//			map.put(nums[i], i);
//		}
//		throw new IllegalArgumentException("No two sum solution");
		
	}
}
public class TwoSum {
	
	static int[] twoSum(int[] nums, int target) {
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    
	    for (int i = 0; i < nums.length; i++) {
	    	System.out.println(target - nums[i]);
	        if (map.containsKey(target - nums[i])) {
	            result[1] = i + 1;
	            result[0] = map.get(target - nums[i]);
	            return result;
	        }
	        map.put(nums[i], i + 1);
	    }
	    return result;
	}

	public static void main(String[] args) {
//		int[] nums = {2, 7, 11, 15};
		int[] nums = {6, 4, 3, 8, 7, 5, 2};
		Solution1 sol = new Solution1();
		int[] result = sol.twoSum(nums, 5);
		System.out.println(result[0] + ", " + result[1]);
//		System.out.println(twoSum(input, 9));

	}

}
