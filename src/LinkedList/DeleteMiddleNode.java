package LinkedList;

public class DeleteMiddleNode {
    public static void main(String[] args) {

    }
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode prev = head, slow = head, fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
}
