package com.ohcompany.sort;

public class QuickSort {

	private static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
		int k = 2;
		int count = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (++count == k) {
				System.out.println( k + " th largest element is " + arr[i]); 
			}
		}
	}
	
	private static void quickSort(int[] arr, int start, int end) {
//		int part2 = partition(arr, start, end);
//		
//		if (start < part2 - 1) {
//			quickSort(arr, start, part2 - 1);
//		}
//		
//		if (part2 < end) {
//			quickSort(arr, part2, end);
//		}
		if (start < end) {
			int part2 = partition(arr, start, end);
			quickSort(arr, start, part2 - 1);
			quickSort(arr, part2, end);
		}
	}
	
	private static int partition(int[] arr, int start, int end) {
//		int pivot = arr[(start + end) / 2];
		int mid = start + (end - start) / 2;
		int pivot = arr[mid];
		while (start <= end) {
			while (arr[start] < pivot) {
				start++;
			}
			while (pivot < arr[end]) {
				end--;
			}
			if (start <= end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		
		return start;
	}
	
	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	private static void printSort(int[] arr) {
		for (int data : arr) {
			System.out.print(data + " > ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
//		int[] inputArray = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
//		int[] inputArray = {3, 2, 1, 5, 6, 4};
		int[] inputArray = {60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40};
		printSort(inputArray);
		quickSort(inputArray);
		printSort(inputArray);

	}

}
