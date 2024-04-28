package LinkedList;

public class ReverseList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(5);

        print(head);

        ListNode dummy = new ListNode(-1,head);
        ListNode temp = dummy;
        while(head != null){
            if(head.next != null && head.val==head.next.val){
                while(head.next != null && head.val==head.next.val)
                   head=head.next;
                temp.next=head.next;
            }
            else{
                temp=temp.next;
            }
            head=head.next;
        }

        print(dummy.next);

    }
    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
