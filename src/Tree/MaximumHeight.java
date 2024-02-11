package Tree;

public class MaximumHeight {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);


        TreeNodeUtil treeNodeUtil = new TreeNodeUtil();
        int h = treeNodeUtil.maxHeight(root);
        System.out.println(h);
    }
}

