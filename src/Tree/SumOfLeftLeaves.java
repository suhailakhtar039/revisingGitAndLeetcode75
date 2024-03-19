package Tree;

public class SumOfLeftLeaves {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(10);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(30);

        int sum = sumOfLeftLeaves(root);
    }
    public static int sumOfLeftLeaves(TreeNode root) {
        boolean left = false;
        int ans = solve(root,left);
        return ans;
    }
    public static int solve(TreeNode root, boolean left){
        if(root == null) return 0;
        int sum = 0;
        if(root.left == null && root.right == null){
            sum += left ?root.val:0;
            return sum;
        }
        sum += solve(root.left, true);
        sum += solve(root.right, false);
        return sum;
    }
}
