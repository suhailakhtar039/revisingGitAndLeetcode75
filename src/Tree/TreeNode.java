package Tree;

public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
        left = right = null;
    }
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class TreeNodeUtil{
    //    max height
    int maxHeight(TreeNode root){
        if(root == null)
            return 0;
        return 1 + Math.max(maxHeight(root.left),maxHeight(root.right));
    }
}