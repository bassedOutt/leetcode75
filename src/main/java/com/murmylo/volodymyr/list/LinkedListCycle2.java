package com.murmylo.volodymyr.list;

import com.murmylo.volodymyr.structures.ListNode;

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null & fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

