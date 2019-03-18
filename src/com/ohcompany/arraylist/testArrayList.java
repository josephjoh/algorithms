package com.ohcompany.arraylist;

import java.util.LinkedList;

class ArrayList {
	private Object[] data;
	private int size;
	private int index;
	
	public ArrayList() {
		this.size = 1;
		this.data = new Object[this.size];
		this.index = 0;
	}
	public void add(Object obj) {
		if (this.index == this.size - 1) {
			doubling();
		}
		data[this.index]= obj;
		this.index++;
	}
	private void doubling() {
		this.size = this.size * 2;
		Object[] newData = new Object[this.size];
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		this.data = newData;
	}
	public Object get(int i) throws Exception {
		if (i > this.index - 1) {
			throw new Exception("ArrayIndexOutOfBound");
		} else if (i < 0) {
			throw new Exception("Negative Value");
		}
		return this.data[i];
	}
	public void remove(int i) throws Exception {
		if (i > this.index - 1) {
			throw new Exception("ArrayIndexOutOfBound");
		} else if (i < 0) {
			throw new Exception("Negative Value");
		}
		for (int x = i; x < this.data.length - 1; x++) {
			data[x] = data[x + 1];
		}
		this.index--;
	}
}
public class testArrayList {

	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		al.add("0");

		LinkedList<Integer> aa = new LinkedList<Integer>();
		aa.offer(1);
		System.out.println(aa.get(0));
		
	}

}
