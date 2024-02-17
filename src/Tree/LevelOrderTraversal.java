package Tree;

import java.util.*;

class LevelOrderTraverse extends TreeNodeUtil{
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return ans;
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> primary = new ArrayList<>();
            int n = queue.size();
            for(int i =0 ; i<n; i++){
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                primary.add(queue.poll().val);
            }
            ans.add(primary);
        }
        return ans;
    }
}

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = null;
        root.left.right = null;
        root.right = null;
        LevelOrderTraverse lev = new LevelOrderTraverse();
        List<List<Integer>> ans = lev.levelOrder(root);
        System.out.println(ans);
    }
}
