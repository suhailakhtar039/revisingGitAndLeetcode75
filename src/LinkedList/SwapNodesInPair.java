package LinkedList;

public class SwapNodesInPair {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode prev1 = null;
        ListNode nxt = head.next;

        if (nxt == null) {
            nxt.next = prev;
            return nxt;
        }

        ListNode temp = head;
        boolean flag = true;

        while (temp != null && temp.next != null) {
            if (flag) {
                head = temp.next;
                flag = false;
            }

            nxt = temp.next.next;

            if (prev1 == null) {
                prev1 = temp;
            } else {
                prev1.next = temp.next;
                prev1 = temp;
            }

            temp.next.next = prev;
            prev.next = nxt;
            prev = nxt;
            temp = nxt;
        }

        return head;
    }
}
