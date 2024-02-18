package Tree;

import java.util.HashMap;
import java.util.Map;

class Construct extends TreeNodeUtil{
    static int index = 0;
    Map<Integer, Integer> indexInInorder = new HashMap<>();
    TreeNode buildTree(int[] preorder, int[] inorder){
        int temp = 0;
        int n = preorder.length;
        for(int i = 0; i<n; i++)
            indexInInorder.put(inorder[i],i);
        return buildTreeUtil(preorder,inorder,0,n-1);
    }
    TreeNode buildTreeUtil(int[] preorder, int[] inorder,int st, int en){
        if(st>en || index >=preorder.length)
            return null;
        int val = preorder[index++];
        TreeNode root = new TreeNode(val);
        if(st == en)
            return root;
        int search = indexInInorder.get(val);
        root.left = buildTreeUtil(preorder, inorder, st, search-1);
        root.right = buildTreeUtil(preorder, inorder, search+1,en);
        return root;
    }
}

public class ConstructPreorderInorder {
    public static void main(String[] args) {
        // int[] preorder = {3,9,20,15,7};
        // int[] inorder = {9,3,15,20,7};
        int[] preorder = {1,2};
        int[] inorder = {2,1};
        Construct construct = new Construct();
        TreeNode root = construct.buildTree(preorder, inorder);
        construct.printPreOrder(root);
    }
}
