package LinkedList;

import java.util.List;

public class IntersectionOfTwoList {
    public static void main(String[] args) {
        ListNode headA = new ListNode(9);
        headA.next = new ListNode(1);
        headA.next.next = new ListNode(2);
        ListNode headB = new ListNode(2);
        ListNode ans = getIntersectionNode(headA, headB);
    }

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = len(headA), lenB = len(headB);
        if (lenA > lenB) {
            int k = lenA - lenB;
            while (k-- > 0)
                headA = headA.next;
            while (headA != null && headB != null) {
                if (headA == headB)
                    return headA;
                headA = headA.next;
                headB = headB.next;
            }
        } else {
            int k = lenB - lenA;
            while (k-- > 0)
                headB = headB.next;
            while (headA != null && headB != null) {
                if (headA == headB)
                    return headA;
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }

    public static int len(ListNode temp) {
        int n = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        return n;
    }
}
