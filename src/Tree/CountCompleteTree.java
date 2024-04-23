package Tree;

public class CountCompleteTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        int ans = solve(root);
        System.out.println(ans);
    }
    public static int solve(TreeNode root){
        if(root == null)return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        return left + right + 1;
    }
}
