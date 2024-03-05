package LinkedList;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        // l2.next = new ListNode(6);
        // l2.next.next = new ListNode(4);

        ListNode head = solve(l1, l2);
    }
    public static ListNode solve(ListNode l1, ListNode l2){
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        ListNode temp1 = l1, temp2 = l2;
        int sum = 0, car = 0;
        while(temp1 != null && temp2 != null){
            sum = temp1.val + temp2.val + car;
            int val = sum%10;
            car = sum/10;
            ListNode newNode = new ListNode(val);
            temp.next = newNode;
            temp = temp.next;

            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1 != null){
            sum = temp1.val + car;
            int val = sum%10;
            car = sum/10;
            temp.next = new ListNode(val);
            temp = temp.next;
            temp1 = temp1.next;
        }

        while(temp2 != null){
            sum = temp2.val + car;
            int val = sum%10;
            car = sum/10;
            temp.next = new ListNode(val);
            temp = temp.next;
            temp2 = temp2.next;
        }
        if(car != 0){
            temp.next = new ListNode(car);
            temp = temp.next;
        }

        return head.next;
    }
}
