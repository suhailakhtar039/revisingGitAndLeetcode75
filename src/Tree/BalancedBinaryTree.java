package Tree;

public class BalancedBinaryTree {
    public static void main(String[] args) {

    }
    int height(TreeNode root){
        if(root == null)return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int l = height(root.left);
        int r = height(root.right);
        if(Math.abs(l-r)>1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
