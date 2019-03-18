package com.ohcompany.bitOperation;

public class testBitOperation {

//	i자릿수의 bit 가 1 이면 ture, 0 이면 false
	static boolean getBit(int num, int i) {
		return (num & (1 << i)) != 0;
	}
	
//	i자릿수의 bit를 1로 셋팅해주고 모든 bit값을 출력
	static int setBit(int num, int i) {
		return (num | (1 << 3));
	}
	
//  i자릿수의 bit를 0으로 하고 나머지 bit는 기존 num의 bit를 출력하여 이 모든 bit값을 출력
	static int clearBit(int num, int i) {
		return num & ~(1 << i);
	}
	
//	i자릿수의 왼쪽 모든 bit들은 0으로 오론쪽 모든 bit들은 기존 num 값으로
	static int clearLeftBits(int num, int i) {
		return num & ((1 << i) - 1);
	}
	
//	모든 bit들은 1로 셋팅하고 인덱스의 오른쪽 bit들은 0으로 셋팅후 반환
	static int clearRightBits(int num, int i) {
		return num & (-1 << (i + 1));
	}
	
	static int updateBit(int num, int i, boolean val) {
		return (num & ~(1 << i)) | ((val ? 1 : 0) << i);
	}
	
	public static void main(String[] args) {
//		1 0 0 1
		System.out.println(getBit(9, 3));
//		0 1 0 1
		System.out.println(getBit(5, 3));
		
//		
		System.out.println(setBit(5, 3));
		
		System.out.println(clearBit(9, 3));
		
//		10101001
		System.out.println(clearLeftBits(169, 3));
		
//		10100000
		System.out.println(clearRightBits(169, 3));
		
		System.out.println(updateBit(169, 3, false));

	}

}
