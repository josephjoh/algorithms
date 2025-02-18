package com.ohcompany.leetcodeArray;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionofTwoArraysII {

	public static int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
        for(int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
            	map.put(nums1[i], map.get(nums1[i])+1);
            } else {
            	map.put(nums1[i], 1);
            }
        }
    
        for(int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }
    
       int[] r = new int[result.size()];
       for(int i = 0; i < result.size(); i++) {
           r[i] = result.get(i);
       }
    
       return r;
	}
	public static void main(String[] args) {
//		int[] nums1 = {4, 9, 5};
//		int[] nums2 = {9, 4, 9, 8, 4};
		
		int[] nums1 = {1, 2, 1, 2};
		int[] nums2 = {2, 2};
		System.out.println(intersect(nums1, nums2));

	}

}
