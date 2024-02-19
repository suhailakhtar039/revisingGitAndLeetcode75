package Tree;

class LCA extends TreeNodeUtil{

    TreeNode min(TreeNode a, TreeNode b){
        if(a.val <= b.val)
            return a;
        return b;
    }
    TreeNode max(TreeNode a, TreeNode b){
        if(a.val >= b.val)
            return a;
        return b;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null)
            return root;
        TreeNode first = min(p,q);
        TreeNode second = max(p,q);
        if(root.val>=first.val && root.val<=second.val){
            return root;
        }
        else if(p.val <= root.val && q.val <= root.val)
            return lowestCommonAncestor(root.left, p, q);
        else
            return lowestCommonAncestor(root.right,p,q);
    }
}

public class LowestCommonAncestor {
    public static void main(String[] args) {
        LCA lca = new LCA();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(5);
        System.out.println(lca.lowestCommonAncestor(root,root.left.left,root.left.right).val);
    }
}
