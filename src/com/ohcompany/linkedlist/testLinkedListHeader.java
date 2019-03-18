package com.ohcompany.linkedlist;

import com.ohcompany.linkedlist.LinkedList.Node;

class LinkedList {
	Node header;
	
	static class Node {
		int data;
		Node next = null;
	}
	
	LinkedList() {
		header = new Node();
	}
	
	void append(int d) {
		Node end = new Node();
		end.data = d;
		Node n = header;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	void delete(int d) {
		Node n = header;
		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
			} else {
				n = n.next;
			}
		}
	}
	
	void removeDupls() {
		Node node = header;
		while (node != null && node.next != null) {
			Node runner = node;
			while (runner.next != null) {
				if (node.data == runner.next.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			node = node.next;
		}
	}
	
	void retrieve() {
		Node n = header.next;
		while (n.next != null) {
			System.out.print(n.data + " => ");
			n = n.next;
		}
		System.out.println(n.data);
	}
	
	Node getFirst() {
		Node h = header;
		return h;
	}
	
}
public class testLinkedListHeader {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(4);
		ll.append(4);
		ll.retrieve();
		ll.removeDupls();
		ll.retrieve();
		
		kThToLast(ll.getFirst(), 2);
	}
	
	private static int kThToLast(Node n, int k) {
		if (n == null) {
			return 0;
		}
		
		int count = 1 + kThToLast(n.next, k);
		if (count == k) {
			System.out.println(k + "th to last node is " + n.data);
		}
		return count;
	}

}
