package com.ohcompany.leetcode;

import java.util.Stack;

public class No84LargestRectangleinHistogram {

	public static int largestRectangleArea (int[] height) {
		int len = height.length;
		Stack<Integer> s = new Stack<Integer>();
		int maxArea = 0;
		for (int i = 0; i <= len; i++) {
			int h = (i == len ? 0 : height[i]);
			if (s.isEmpty() || h >= height[s.peek()]) {
				s.push(i);
			} else {
				int tp = s.pop();
				maxArea = Math.max(maxArea,  height[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
				i--;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] h = {2, 1, 5, 6, 2, 4};
		System.out.println(largestRectangleArea(h));
	}

}
