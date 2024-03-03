package LinkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LinkedListComponents {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);

        int[] nums = {0,2,1,3,4};
        System.out.println(solve(root,nums));
    }
    public static int solve(ListNode head, int[]G){
        Set<Integer> setG = new HashSet<>();
        for (int i: G) setG.add(i);
        int res = 0;
        while (head != null) {
            if (setG.contains(head.val) && (head.next == null || !setG.contains(head.next.val))) res++;
            head = head.next;
        }
        return res;
    }
}
