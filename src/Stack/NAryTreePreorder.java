package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class NAryTreePreorder {
    public List<Integer> preorder(Node root) {
        Stack<Node> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root == null)return list;

        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            list.add(root.val);
            for(int i = root.children.size() - 1; i>=0; i--)
                st.add(root.children.get(i));
        }
        return list;
    }
}
