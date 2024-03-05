package Tree;

import java.util.Stack;

public class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val){
        this.val = val;
        left = right = null;
    }
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class TreeNodeUtil{
    //    max height
    int maxHeight(TreeNode root){
        if(root == null)
            return 0;
        return 1 + Math.max(maxHeight(root.left),maxHeight(root.right));
    }

    // print tree inorder
    void printPreOrder(TreeNode root){
        if(root == null)
            return;
        System.out.println(root.val);
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    public void iterativeInorder(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        while(!st.empty() || root != null){
            while(root != null){
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            System.out.println(root.val);
            root = root.right;
        }
        return ;
    }
}