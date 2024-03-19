package Tree;

public class Path {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(10);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(30);
        boolean s = hasPathSum(root,4);
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        boolean ans = solve(root, 0, targetSum);
        return ans;
    }
    public static boolean solve(TreeNode root, int sum, int target){
        if(root == null)return false;
        if(root.left == null && root.right == null){
            sum+= root.val;
            System.out.println(sum);
            if(sum == target){
                return true;
            }
            return false;
        }
        boolean left = solve(root.left, sum+root.val,target);
        boolean right = solve(root.right,sum+root.val,target);
        return left || right;
    }
}
