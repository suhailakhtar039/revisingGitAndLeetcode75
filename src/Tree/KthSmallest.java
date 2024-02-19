package Tree;

import java.util.Stack;

class Demo extends TreeNodeUtil{
    public int kthSmallest(TreeNode root,int k){
        Stack<TreeNode> st = new Stack<>();
        while(!st.empty() || root != null){
            while(root != null){
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            if(--k == 0) break;
            root = root.right;
        }
        return root.val;
    }
}

public class KthSmallest {
    public static void main(String[] args) {
        Demo demo = new Demo();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(5);
        int k = 1;
        System.out.println(demo.kthSmallest(root,k));
    }
}
