package Tree;

import java.util.ArrayList;
import java.util.List;

class BST extends TreeNodeUtil {
    public void isValidBSTUtil(TreeNode root, List<Integer> check){
        if(root == null)return;
        isValidBSTUtil(root.left,check);
        check.add(root.val);
        isValidBSTUtil(root.right,check);
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        isValidBSTUtil(root,list);
        if(list.size() == 1)
            return true;
        System.out.println(list);
        for(int i = 0; i<list.size()-1; i++){
            if(list.get(i+1) < list.get(i))
                return false;
        }
        return true;
    }
}

public class ValidateBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        BST bst = new BST();
        System.out.println(bst.isValidBST(root));
    }
}
