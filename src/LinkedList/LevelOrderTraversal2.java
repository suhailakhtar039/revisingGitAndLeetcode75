package LinkedList;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal2 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
            return res;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int n = q.size();
            for(int i = 0; i<n; i++){
                TreeNode top = q.poll();
                temp.add(top.val);
                if(top.left != null) q.add(top.left);
                if(top.right != null)  q.add(top.right);
            }
            res.add(temp);
        }
        Collections.reverse(res);
        return res;
    }
}
