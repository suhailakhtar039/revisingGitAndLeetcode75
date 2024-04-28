package LinkedList;

public class RotateString {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        print(head);

        int k = 5;
        int n = len(head);

        k %= n;
        if(k == 0){
            System.exit(0);
        }
        ListNode prev = head, temp = head;
        for(int i = 0; i<n-k; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        ListNode temp1 = temp;
        while(temp.next != null)
            temp = temp.next;
        temp.next = head;

        print(temp1);
    }

    public static int len(ListNode head) {
        int i = 0;
        while (head != null) {
            head = head.next;
            i++;
        }
        return i;
    }


    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
