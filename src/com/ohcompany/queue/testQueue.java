package com.ohcompany.queue;

import java.util.NoSuchElementException;

/**
 * 먼저 집어넣은 데이터를 먼저 꺼내는 저장공
 * (한쪽은 넣기만하고 한쪽은 꺼내기만 하는것)
 * First In First Out
 * add() - 맨 끝에 데이터를 하나 넣는
 * remove() - 맨 앞에서 데이터를 하나 꺼내는 
 * peek() - 맨 앞의 데이터를 보는 
 * isEmpty()
 * @author josephoh
 *
 */

class Queue<T> {
	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> first;
	private Node<T> last;
	
	public void add(T item) {
		Node<T> t = new Node<T>(item);
		
		if (last != null) {
			last.next = t;
		}
		last = t;
		if (first == null) {
			first = last;
		}
	}
	
	public T romove() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		
		T data = first.data;
		first = first.next;
		
		if (first == null) {
			last = null;
		}
		return data;
	}
	
	public T peek() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
}
public class testQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.romove());
		System.out.println(q.romove());
		System.out.println(q.peek());
		System.out.println(q.romove());
		System.out.println(q.isEmpty());
		System.out.println(q.romove());
		System.out.println(q.isEmpty());
	}

}
