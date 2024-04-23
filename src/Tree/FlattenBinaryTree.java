package Tree;

public class FlattenBinaryTree {
    private static TreeNode prev = null;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        printInOrder(root);
        System.out.println("=========");
        solve(root);
        printInOrder(prev);
    }

    private static void solve(TreeNode root) {
        if(root == null)return;
        solve(root.right);
        solve(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

    private static void printInOrder(TreeNode root) {
        if(root == null)return;
        printInOrder(root.left);
        System.out.println(root.val);
        printInOrder(root.right);
    }
}
