package com.murmylo.volodymyr.list;
import com.murmylo.volodymyr.structures.ListNode;

public class Merge2SortedLists {
    /*
        Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]
    */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null) {
            current.next = l1;
        } else if (l2 != null) {
            current.next = l2;
        }
        return head.next;
    }
}
