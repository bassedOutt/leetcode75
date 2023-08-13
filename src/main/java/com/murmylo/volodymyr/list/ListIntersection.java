package com.murmylo.volodymyr.list;

import com.murmylo.volodymyr.structures.ListNode;

public class ListIntersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length1 = 0;
        int length2 = 0;
        ListNode aTemp = headA;
        ListNode bTemp = headB;
        while (aTemp != null || bTemp != null) {
            if (aTemp != null) {
                aTemp = aTemp.next;
                length1++;
            }
            if (bTemp != null) {
                bTemp = bTemp.next;
                length2++;
            }
        }
        aTemp = headA;
        bTemp = headB;
        if (length1 > length2) {
            int length = length1 - length2;
            for (int i = 0; i < length; i++) {
                aTemp = aTemp.next;
            }
        } else {
            int length = length2 - length1;
            for (int i = 0; i < length; i++) {
                bTemp = bTemp.next;
            }
        }
        while (aTemp != null || bTemp != null) {
            if (aTemp == bTemp) {
                return aTemp;
            }
            aTemp = aTemp.next;
            bTemp = bTemp.next;
        }
        return null;
    }

    public ListNode getIntersectionNodeAlt(ListNode headA, ListNode headB) {
        //boundary check
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while (a != b) {
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }
}
