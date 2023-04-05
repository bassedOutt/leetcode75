package com.murmylo.volodymyr;

import com.murmylo.volodymyr.Merge2SortedLists.ListNode;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int counter = 0;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        temp = head;
        for (int i = 0; i < counter / 2; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public ListNode middleNode2(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
