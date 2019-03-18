package com.ohcompany.leetcodeArray;

public class RotateImage {
	
	static void rotate(int[][] matrix) {
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[0].length; j++) {
//				int temp = 0;
//				temp = matrix[i][j];
//				matrix[i][j] = matrix[j][i];
//				matrix[j][i] = temp;
//			}
//		}
//		
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix.length / 2; j++) {
//				int temp = 0;
//				temp = matrix[i][j];
//				matrix[i][j] = matrix[i][matrix.length - 1 - j];
//				matrix[i][matrix.length - 1 - j] = temp;
//			}
//		}
		
		
	}
	
	private static int[][] rotateImage(int[][] image) {
		int tmp;
		for (int s = 0, e = image.length - 1; s < e; s++, e--) {
			for (int i = s, j = e; i < e; i++, j--) {
				tmp = image[s][i];
				image[s][i] = image[i][e];
				image[i][e] = image[e][j];
				image[e][j] = image[j][s];
				image[j][s] = tmp;
			}
		}
		return image;
	}
	
	private static  void printImage(int[][] image) {
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				System.out.print(image[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
//		int[][] matrix = {
//				{1, 2, 3},
//				{4, 5, 6},
//				{7, 8, 9}
//		};
//		rotate(matrix);
		
		
		int[][] image = {
				{1, 0, 0, 0, 1},
				{0, 1, 0, 1, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0}
		};
		printImage(image);
		rotateImage(image);
		printImage(image);
	}

}
