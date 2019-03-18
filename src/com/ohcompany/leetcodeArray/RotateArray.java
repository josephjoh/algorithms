package com.ohcompany.leetcodeArray;

public class RotateArray {
	
	private static void rotate(int[] nums, int k) {
//		for (int i = 0; i < k; i++) {
//			int temp = nums[nums.length - 1];
//			for (int j = nums.length - 1; j >= 1; j--) {
//				nums[j] = nums[j - 1];
//			}
//			nums[0] = temp;
//		}
		
		k = k % nums.length;
		reserve(nums, 0, nums.length - k - 1);
		reserve(nums, nums.length - k, nums.length - 1);
		reserve(nums, 0, nums.length - 1);
	}
	
	private static void reserve(int[] nums, int i, int j) {
		int tmp = 0;
		while (i < j) {
			tmp = nums[i];
			nums[i] = nums[j];
			nums[j] = tmp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
//		int[] rotateArray = {1, 2, 3, 4, 5, 6, 7};
		int[] rotateArray = {-1, -100, 3, 99};
		int maxium = 2;
		rotate(rotateArray, maxium);
	}

}
