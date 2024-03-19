package Tree;

import java.util.ArrayList;
import java.util.List;

public class Path2 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(10);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(30);

        List<List<Integer>> list = pathSum(root,15);
    }
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean a = solve(root,0, targetSum, res, temp);
        return res;
    }
    public static boolean solve(TreeNode root, int sum, int target, List<List<Integer>> res, List<Integer> temp){
        if(root == null)return false;
        if(root.left == null && root.right == null){
            sum+= root.val;
            temp.add(root.val);
            if(sum == target){
                res.add(new ArrayList<>(temp));
                temp.remove(temp.size()-1);
                return true;
            }else{
                temp.remove(temp.size()-1);
                return false;
            }
        }
        temp.add(root.val);
        boolean left = solve(root.left, sum+root.val,target, res,temp);
        boolean right = solve(root.right,sum+root.val,target,res,temp);
        temp.remove(temp.size()-1);
        return left || right;
    }
}
