package LinkedList;

public class DeleteNode {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        solve(root.next);
        ListNode temp = root;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void solve(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
