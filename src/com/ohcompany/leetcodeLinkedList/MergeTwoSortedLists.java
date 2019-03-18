package com.ohcompany.leetcodeLinkedList;

public class MergeTwoSortedLists {
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		
		ListNode mergeHead;
		if (l1.val < l2.val) {
			mergeHead = l1;
			mergeHead.next = mergeTwoLists(l1.next, l2);
		} else {
			mergeHead = l2;
			mergeHead.next = mergeTwoLists(l1, l2.next);
		}
		return mergeHead;
	}

	public static void main(String[] args) {
		ListNode l1 = null;
		ListNode l2 = null;
		mergeTwoLists(l1, l2);

	}

}
