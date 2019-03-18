package com.ohcompany.leetcode;

public class No42TrappingRainWater {

	public static void main(String[] args) {
		int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2,1};
		System.out.println(trap(height));
	}
	public static int trap (int[] height) {
		int l = height.length;
		if (l == 0) {
			return 0;
		}
		int leftMax = height[0];
		int sum = 0;
		int finalSum = 0;
		for (int i = 1; i < l; i++) {
			if (height[i] >= leftMax) {
				leftMax = height[i];
				finalSum = finalSum + sum;
				sum = 0;
			} else {
				sum = sum + (leftMax - height[i]);
			}
		}
		int rightMax = height[l - 1];
		sum = 0;
		for (int i = l - 2; i >= 0; i--) {
			if (height[i] > rightMax) {
				rightMax = height[i];
				finalSum = finalSum + sum;
				sum = 0;
			} else {
				sum = sum + (rightMax - height[i]);
			}
		}
		return finalSum;
	}

}
