package Tree;

class Sum extends TreeNodeUtil{
    public int ans = Integer.MIN_VALUE;
    public int maximumSum(TreeNode root){
        maximumSumUtil(root);
        return ans;
    }
    public int maximumSumUtil(TreeNode root){
        if(root == null)return 0;
        int left = Math.max(0,maximumSumUtil(root.left));
        int right = Math.max(0,maximumSumUtil(root.right));
        int curr = root.val + left + right;
        ans = Math.max(ans, curr);
        return root.val + Math.max(left, right);
    }
}

public class BinaryTreeMaximumPath {
    public static void main(String[] args) {

    }
}
