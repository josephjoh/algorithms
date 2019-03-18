package com.ohcompany.sort;

public class BubbleSort {
	
	private static void bubbleSort(int[] arr) {
		bubbleSort(arr, arr.length - 1);
	}
	
	private static void bubbleSort(int[] arr, int last) {
		if (last > 0) {
			for (int i = 1; i <= last; i++) {
				if (arr[i - 1] > arr[i]) {
					swqp(arr, i - 1, i);
				}
			}
			bubbleSort(arr, last - 1);
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
		bubbleSort(inputArray);
		printSort(inputArray);
	}

}
