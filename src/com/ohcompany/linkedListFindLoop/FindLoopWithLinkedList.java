package com.ohcompany.linkedListFindLoop;

class Node {
	int val;
	Node next;
	Node(int x) {
		val = x;
	}
}

public class FindLoopWithLinkedList {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n4;
		
		Node n = findLoop(n1);
		
		if (n != null) {
			System.out.println("Starts to loop > " + n.val);
		} else {
			System.out.println("Not found");
		}

	}
	
	private static Node findLoop(Node head) {
		Node fast = head;
		Node slow = head;
		
		while (fast != null && slow != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		
		if (fast == null && fast.next == null) {
			return null;
		}
		
		slow = head;
		
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return fast;
	}

}
