package com.ohcompany.sort;

public class SelectionSort {
	
	private static void selectionSort(int[] arr) {
		selectionSort(arr, 0);
	}
	
	private static void selectionSort(int[] arr, int start) {
		if (start < arr.length - 1) {
			int minIndex = start;
			for (int i = start; i < arr.length; i++) {
				if (arr[i] < arr[minIndex]) {
					minIndex = i;
				}
			}
			swqp(arr, start, minIndex);
			selectionSort(arr, start + 1);
		}
	}
	
	private static void swqp(int[] arr, int source, int target) {
		int temp = arr[source];
		arr[source] = arr[target];
		arr[target] = temp;
	}
	
	private static void printSort(int[] arr) {
		for (int data : arr) {
			System.out.print(data + " > ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] inputArray = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
		printSort(inputArray);
		selectionSort(inputArray);
		printSort(inputArray);
	}
}
