package com.ohcompany.stack;

import java.util.EmptyStackException;

/**
 * Last In First Out
 * 바로넣었다가 거꾸로 정렬된 데이터를 꺼내 쓰고 싶을때 유용
 * pop() - 맨 마지막에 넣은 데이터를 갖고오면서 지우는 것
 * push() - 새로운 데이터를 맨 위에 쌓아 올리는 
 * peek() - 맨 마지막 데이터를 보는
 * isEmpty()
 * @author josephoh
 *
 */

class Stack<T> {
	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data){
			this.data = data;
		}
	}
	
	private Node<T> top;
	
	public T pop() {
		if (top == null) {
			throw new EmptyStackException();
		}
		
		T item = top.data;
		top = top.next;
		return item;
	}
	
	public void push (T item) {
		Node<T> t = new Node<T>(item);
		t.next = top;
		top = t;
	}
	
	public T peek() {
		if (top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
}
public class testSatck {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
//		s.push(2);
//		s.push(3);
//		s.push(4);
//		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peek());
//		System.out.println(s.pop());
//		System.out.println(s.isEmpty());
//		System.out.println(s.pop());
//		System.out.println(s.isEmpty());
	}

}
