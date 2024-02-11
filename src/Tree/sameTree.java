package Tree;

class sameTreeExpected extends TreeNodeUtil{
    boolean isSame(TreeNode p, TreeNode q){
        if(p==null && q==null)
            return true;
        if(p == null || q == null)
            return false;
        if(p.val == q.val)
            return isSame(p.left, q.left) && isSame(p.right, q.right);
        return false;
    }
}

public class sameTree {
    public static void main(String[] args) {
        sameTreeExpected s = new sameTreeExpected();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(3);

        System.out.println(s.isSame(root, root1));
    }
}
