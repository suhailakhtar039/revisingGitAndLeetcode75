package LinkedList;

import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(2);
        root.next.next.next = new Node (1);

        Stack<Node> s = new Stack<Node>();
        Node temp = root;
        while(temp != null){
            s.push(temp);
            temp = temp.next;
        }
        boolean ans;
        temp = root;
        while(!s.empty()){
            if(temp.val != s.pop().val){
                System.out.println("Not palindrome");
                return;
            }
            temp = temp.next;
        }
        System.out.println("palindrome");
    }
}
