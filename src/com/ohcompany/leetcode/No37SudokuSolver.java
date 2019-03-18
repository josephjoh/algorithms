package com.ohcompany.leetcode;

import java.util.Arrays;

class Solution {
	public static void solveSodoku(char[][] board) {
		backtrack(board, 0);
	}
	
	public static boolean backtrack(char[][] board, int idx) {
		if (idx == 81) {
			return true;
		}
		int row = idx / 9;
		int col = idx % 9;
		char cur = board[row][col];
		if (cur != '.') {
			return backtrack(board, idx + 1);
		} else {
			for (int i = 1; i <= 9; i++) {
				board[row][col] = (char) i;
				if (isValidSudoku(board)) {
					boolean b = backtrack(board, idx + 1);
					if (b) {
						return b;
					}
				}
			}
			board[row][col] = '.';
			return false;
		}
	}
	
//	valid sudoku
	public static boolean isValidSudoku (char[][] board) {
		boolean[] b = new boolean[9];
		//룰의 종류, 가로, 세로, 섭그리드
		for (int i = 0; i < 3; i++) {
			//한줄의 규칙
			for (int j = 0; j < 9; j++) {
				Arrays.fill(b, false);
				for (int k = 0; k < 9; k++) {
					char cur = '.';
					if (i == 0) {
						//가로
						cur = board[j][k];
					} else if (i == 1) {
						//세로
						cur = board[k][j];
					} else {
						//섭그리드
						cur = board[j / 3 * 3 + k / 3][j % 3 * 3 + k % 3];
					}
					if (cur == '.') {
						continue;
					}
					int val = Character.getNumericValue(cur);
					if (b[val - 1]) {
						return false;
					}
					b[val - 1] = true;
				}
			}
		}
		return true;
	}
}


public class No37SudokuSolver {

	public static void main(String[] args) {
		char[][] board = new char[9][9];
//		int grid[N][N] = {{3, 0, 6, 5, 0, 8, 4, 0, 0}, 
//                {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
//                {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
//                {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
//                {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
//                {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
//                {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
//                {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
//                {0, 0, 5, 2, 0, 6, 3, 0, 0}};
		Solution.solveSodoku(board);
	}

}
