package com.murmylo.volodymyr.list;

import com.murmylo.volodymyr.structures.ListNode;

public class ReverseList {
    public ListNode reverseList(ListNode head){
        ListNode newHead = null;
        while (head != null) {
            ListNode temp = newHead;
            newHead = new ListNode(head.val);
            newHead.next = temp;
            head = head.next;
        }
        return newHead;
    }
}
