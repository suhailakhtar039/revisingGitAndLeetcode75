package Tree;

class SubTree extends TreeNodeUtil{
    boolean isSame(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        if(root1.val == root2.val){
            return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
        }
        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(root == null)return false;

        if(isSame(root,subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}

public class SubtreeOfAnotherTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(4);
        // root.right = new TreeNode(5);
        // root.left.left = new TreeNode(1);
        // root.left.right = new TreeNode(2);

        TreeNode subRoot = new TreeNode(4);
        // subRoot.left = new TreeNode(1);
        // subRoot.right = new TreeNode(2);

        SubTree s = new SubTree();
        System.out.println(s.isSubtree(root, subRoot));
    }
}
