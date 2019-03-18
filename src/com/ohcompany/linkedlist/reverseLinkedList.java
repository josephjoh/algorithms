package com.ohcompany.linkedlist;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { 
		val = x;
	}
}

public class reverseLinkedList {
	
	public static ListNode reverseList(ListNode head) {
        //Iteration
        
        ListNode prev = null;
        ListNode curr = head;
        while (head != null) {
        	System.out.print(head.val);
        	head = head.next;
        }
        
        
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        
        while (prev != null) {
        	System.out.print(prev.val);
        	prev = prev.next;
        }
        return prev;
	}

	public static void main(String[] args) {
		ListNode ln = new ListNode(1);
		ln.next = new ListNode(2);
		ln.next.next = new ListNode(3);
		ln.next.next.next = new ListNode(4);

		System.out.println(reverseList(ln));
	}

}
