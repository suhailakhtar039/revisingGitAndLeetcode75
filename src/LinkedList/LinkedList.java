package LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LinkedList{
    public static void main(String[] args) {
        LinkedListTest demo = new LinkedListTest();
        Node head = demo.add(1);
        demo.add(2);
        demo.add(3);
        demo.add(4);
        demo.add(5);
        demo.add(6);
        demo.reorder(head);
        demo.print();
    }
}

class Node{
    int val;
    Node next;
    public Node(int data){
        val = data;
        this.next = null;
    }
}

class LinkedListTest {
    private Node head;

    LinkedListTest(){
        this.head = null;
    }

    //1st add val
    public Node add(int a){
        Node newNode = new Node(a);
        if(head == null){
            head = newNode;
            return head;
        }
        Node demo = head;
        while(demo.next != null){
            demo = demo.next;
        }
        demo.next = newNode;
        return head;
    }

    //2nd print
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //3
    public Node reverseIteratively(Node head){
        Node prev = null, next = null, curr = head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    //4 cycle detection
    public boolean hasCycle(Node head){
        if(head == null || head.next == null || head.next.next == null)
            return false;
        Node slow = head, fast = head.next.next;
        while(fast != null && fast.next !=null && fast.next.next != null){
            if(slow == fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
    //5 merge two
    public Node merge(Node list1, Node list2){
        if(list1 == null && list2 != null)
            return list2;
        if(list2 == null && list1 != null)
            return list1;
        if(list1 == null && list2 == null)
            return null;

        int mn = Integer.min(list1.val, list2.val);
        if(list1.val < list2.val){
            list1 = list1.next;
        }
        else {
            list2 = list2.next;
        }
        Node head = new Node(mn);
        Node temp = head;
        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                temp.next = new Node(list1.val);
                list1 = list1.next;
            }
            else{
                temp.next = new Node(list2.val);
                list2 = list2.next;
            }
            temp = temp.next;
        }
        while(list1!=null){
            temp.next = new Node(list1.val);
            list1 = list1.next;
            temp = temp.next;
        }

        while(list2!=null){
            temp.next = new Node(list2.val);
            list2 = list2.next;
            temp = temp.next;
        }
        return head;

    }
    //6
    public Node mergeKsorted(Node[] lists){
        PriorityQueue<Node> pq = new PriorityQueue<>(new Random());
        for(Node n: lists){
            if(n != null)
                pq.add(n);
        }
        Node ans = new Node(-1);
        Node temp = ans;
        while(!pq.isEmpty()){
            Node curr = pq.poll();
            temp.next = curr;
            temp = curr;
            if(curr.next != null)
                pq.add(curr.next);
        }
        return ans.next;
    }
    //7
    public Node removeNthNodeFromEnd(Node head, int n){
        if(head == null)
            return head;
        if(head.next == null)
            return null;

        int sze = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            sze++;
        }
        if(sze == n){
            return head.next;
        }
        Node prev = head, curr = head;
        for (int i = 0; i < sze-n; i++) {
            prev = curr;
            curr = curr.next;
            curr = curr;
        }
        prev.next = curr.next;
        return head;
    }
    //8
    public void reorder(Node head){
        if(head == null || head.next == null)
            return;
        //1. Finding the middle
        Node middle = head, last = head;
        while(last.next!=null && last.next.next!=null){
            middle = middle.next;
            last = last.next.next;
        }
        //2. reversing the list
        Node prev = null, curr = middle.next, nxt = middle.next;
        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        middle.next = prev;
        //3. reordering
        Node p1=head, p2=middle.next;
        while(p1!=middle){
            middle.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=middle.next;
        }
    }
}
class Random implements Comparator<Node> {

    @Override
    public int compare(Node o1, Node o2) {
        if(o1.val > o2.val)
            return 1;
        else if(o1.val < o2.val)
            return -1;
        return 0;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
        next = null;
    }
    ListNode(int val, ListNode nxt){
        this.val = val;
        this.next = nxt;
    }
}
