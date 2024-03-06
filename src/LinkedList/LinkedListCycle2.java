package LinkedList;

public class LinkedListCycle2 {
    public static void main(String[] args) {

    }
    public static ListNode detectCycle(ListNode head) {
        // if(head == null || head.next == null)return head;

        ListNode slow = head, fast = head;
        boolean cycle = false;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(fast == null || fast.next == null){
            return null;
        }
        fast = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
