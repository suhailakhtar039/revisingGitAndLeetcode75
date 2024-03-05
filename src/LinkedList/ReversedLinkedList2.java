package LinkedList;

public class ReversedLinkedList2 {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);

        int left = 2, right = 4;
        ListNode head = reverse(root, left, right);
    }

    public static ListNode reverse(ListNode root, int left, int right){
        if(root == null)
            return root;

        ListNode dummy = new ListNode(0); // created dummy node
        dummy.next = root;
        ListNode prev = dummy; // intialising prev pointer on dummy node

        for(int i = 0; i < left - 1; i++)
            prev = prev.next; // adjusting the prev pointer on it's actual index

        ListNode curr = prev.next; // curr pointer will be just after prev
        // reversing
        for(int i = 0; i < right - left; i++){
            ListNode forw = curr.next; // forw pointer will be after curr
            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
        }
        // ListNode temp = dummy;
        // while(temp!=null){
        //     System.out.println(temp.val);
        //     temp = temp.next;
        // }
        return dummy.next;
    }
}
