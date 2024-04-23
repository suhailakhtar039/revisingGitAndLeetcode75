package Tree;

import java.util.LinkedList;
import java.util.Queue;

// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};


class PopulatingRightOfNode {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root == null)return root;
        q.add(root);
        while(q.size() != 0){
            int n = q.size();
            Node prev = null;
            for(int i = n; i > 0; i--){
                Node cur = q.poll();
                cur.next = prev;
                prev = cur;
                if(cur.right != null)
                    q.add(cur.right);

                if(cur.left != null)
                    q.add(cur.left);
            }
        }
        return root;
    }
}