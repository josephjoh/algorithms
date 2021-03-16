package com.ohcompany.sort;

public class MergeSort {
	
	private static void mergeSort(int[] arr) {
		int[] tmp = new int[arr.length];
		mergeSort(arr, tmp, 0, arr.length - 1);
	}
	
	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		if (start < end) {
//			int mid = (start + end) / 2;
			int mid = start + (end - start) / 2;
			mergeSort(arr, tmp, start, mid);
			mergeSort(arr, tmp, mid + 1, end);
			merge(arr, tmp, start, mid, end);
		}
	}
	
	private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		
		for (int i = start; i <= end; i++) {
			tmp[i] = arr[i];
		}
		
		int left = start;
		int right = mid + 1;
		int index = start;
		
		while (left <= mid || right <= end) {
			if (left <= mid && right <= end) {
				if (tmp[left] <= tmp[right]) {
					arr[index] = tmp[left];
					left++;
				} else {
					arr[index] = tmp[right];
					right++;
				}
			} else if (left <= mid) {
				arr[index] = tmp[left];
				left++;
			} else if (right <= end) {
				arr[index] = tmp[right];
				right++;
			}
			index++;
		}
		
//		int part1 = start;
//		int part2 = mid + 1;
//		int index = start;
		
//		while (part1 <= mid && part2 <= end) {
//			if (tmp[part1] <= tmp[part2]) {
//				arr[index] = tmp[part1];
//				part1++;
//			} else {
//				arr[index] = tmp[part2];
//				part2++;
//			}
//			index++;
//		}
//		
//		for (int i = 0; i<= mid - part1; i++) {
//			arr[index + i] = tmp[part1 + i];
//		}
	}

	private static void printSort(int[] arr) {
		for (int data : arr) {
			System.out.print(data + " > ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
//		int[] inputArray = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
//		int[] inputArray = {38, 27, 43, 3, 9, 82, 10};
		int[] inputArray = {1, 5, 3, 2, 8, 7, 6, 4};
		printSort(inputArray);
		mergeSort(inputArray);
		printSort(inputArray);
	}

}
