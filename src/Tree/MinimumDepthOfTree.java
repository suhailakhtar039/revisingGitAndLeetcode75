package Tree;

public class MinimumDepthOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(10);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(30);
        int d = minDepth(root);
    }
    public static int minDepth(TreeNode root) {
        if(root == null)return 0;
        if(root.left == null && root.right == null) return 1;
        if(root.left == null) return minDepth(root.right)+1;
        if(root.right == null) return minDepth(root.left)+1;
        return 1 + Math.min(minDepth(root.left),minDepth(root.right));
    }
}
