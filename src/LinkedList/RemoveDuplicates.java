package LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(1);
        root.next.next = new ListNode(2);
        root.next.next.next = new ListNode(3);
        root.next.next.next.next = new ListNode(3);
        ListNode ans = solve(root);
    }
    public static ListNode solve(ListNode head){
        if(head == null)return head;
        ListNode prev = head, temp = head;
        while(temp != null){
            if(temp.val != prev.val){
                prev.next = temp;
                prev = temp;
            }
            temp = temp.next;
        }
        prev.next = null;

        temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        return head;
    }
}
