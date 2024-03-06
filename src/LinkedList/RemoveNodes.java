package LinkedList;

public class RemoveNodes {
    public static void main(String[] args) {

    }
    public static ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null)
            return head;

        head = reverse(head);

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode temp = head, prev = head;

//        while(head != null){
//            System.out.println(head.val);
//            head = head.next;
//        }
        int curMax = head.val;
        temp = temp.next;
        while(temp != null){
            if(temp.val >= curMax){
                prev.next = temp;
                prev = temp;
            }
            curMax = Math.max(curMax, temp.val);
            temp = temp.next;
        }
        prev.next = null;
        head = reverse(head);
//        while(head != null){
//            System.out.println(head.val);
//            head = head.next;
//        }
        return head;
    }
    public static ListNode reverse(ListNode head){
        ListNode temp = head, curr = head, prev = null;
        while(temp != null){
            curr = temp.next;
            temp.next = prev;

            prev = temp;
            temp = curr;
        }
        return prev;
    }
}
