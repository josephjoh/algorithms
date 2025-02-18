package com.ohcompany.leetcodeLinkedList;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}
public class ReverseLinkedList {

//	iterative solution
	public static ListNode reverseList(ListNode head) {
		ListNode newHead = null;
		
		while (head != null) {
			ListNode next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}
	
//	recursive solution
	public static ListNode reverseList2(ListNode head) {
		return reverseListInt(head, null);
	}
	
	private static ListNode reverseListInt (ListNode head, ListNode newHead) {
		if (head == null) {
			return newHead;
		}
		ListNode next = head.next;
		head.next = newHead;
		return reverseListInt(next, head);
	}
	
	private static void printLinkedList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " > ");
			head = head.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ListNode ls = new ListNode(1);
		ls.next = new ListNode(2);
		ls.next.next = new ListNode(3);
		ls.next.next.next = new ListNode(4);
//		ls.val = 2;
//		ls.next.val = 2;
//		ls.next.next.val = 3;
//		ls.next.next.next.val = 4;
//		ls.next.next.next.next.val = 5;
		
		System.out.println(ls.val);
		System.out.println(ls.next.val);
		System.out.println(ls.next.next.val);
		System.out.println(ls.next.next.next.val);
		
		printLinkedList(ls);
		
		//Iterator
//		printLinkedList(reverseList(ls));
		
		//Recursion
		printLinkedList(reverseList2(ls));
		
		
//		System.out.println(ls.val);
//		System.out.println(ls.next.val);
//		System.out.println(ls.next.next.val);
//		System.out.println(ls.next.next.next.val);
	}

}
//class LinkedList { 
//	  
//    static Node head; 
//  
//    static class Node { 
//  
//        int data; 
//        Node next; 
//  
//        Node(int d) { 
//            data = d; 
//            next = null; 
//        } 
//    } 
//  
//    /* Function to reverse the linked list */
//    Node reverse(Node node) { 
//        Node prev = null; 
//        Node current = node; 
//        Node next = null; 
//        while (current != null) { 
//            next = current.next; 
//            current.next = prev; 
//            prev = current; 
//            current = next; 
//        } 
//        node = prev; 
//        return node; 
//    } 
//  
//    // prints content of double linked list 
//    void printList(Node node) { 
//        while (node != null) { 
//            System.out.print(node.data + " "); 
//            node = node.next; 
//        } 
//    } 
//  
//    public static void main(String[] args) { 
//        LinkedList list = new LinkedList(); 
//        list.head = new Node(85); 
//        list.head.next = new Node(15); 
//        list.head.next.next = new Node(4); 
//        list.head.next.next.next = new Node(20); 
//          
//        System.out.println("Given Linked list"); 
//        list.printList(head); 
//        head = list.reverse(head); 
//        System.out.println(""); 
//        System.out.println("Reversed linked list "); 
//        list.printList(head); 
//    } 
//} 