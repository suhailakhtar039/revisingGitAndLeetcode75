package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        Stack<TreeNode> s = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        while(root != null || !s.empty()){
            while(root != null){
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            ans.add(root.val);
            root = root.right;
        }

        System.out.println(ans);
    }
}
