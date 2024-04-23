package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecoverTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);
        // printing the tree
        printTree(root);
        List<TreeNode> listInorder = new ArrayList<>();
        List<Integer> listGained = new ArrayList<>();
        findInOrder(root, listInorder);
        // add val to sorted list
        for (int i = 0; i < listInorder.size(); i++) {
            listGained.add(listInorder.get(i).val);
        }
        List<Integer> sortedList = new ArrayList<>(listGained);
        // compare listInOrder with sorted values
        Collections.sort(sortedList, (a, b) -> {
            if (a > b) return 1;
            else if (a < b) return -1;
            return 0;
        });
        // two values which are not same
        List<Integer> notSame = new ArrayList<>();
        for (int i = 0; i < listGained.size(); i++) {
            if (listGained.get(i) != sortedList.get(i)) {
                notSame.add(listGained.get(i));
            }
        }

        System.out.println(notSame);
        System.out.println("=====function started=====");
        correctTree(root, notSame);
        System.out.println("=====printing function called======");
        printTree(root);
    }

    private static void correctTree(TreeNode root, List<Integer> notSame) {
        if (root == null) return;
        correctTree(root.left, notSame);
        if (root.val == notSame.get(0) || root.val == notSame.get(1)) {
            System.out.println("<--- within if condition --->");
            int first = notSame.get(0), second = notSame.get(1);
            System.out.println("root.val = " + root.val + " first = " + first + " second= " + second);
            System.out.println(notSame);
            if (root.val == first) {
                root.val = second;
            } else {
                root.val = first;
            }
            System.out.println("root.val = " + root.val + " first = " + first + " second= " + second);
            System.out.println(notSame);
            System.out.println("<--- outside if condition --->");
        }
        System.out.println(root.val + " ");
        correctTree(root.right, notSame);
    }

    public static void findInOrder(TreeNode root, List<TreeNode> list) {
        if (root == null) return;
        findInOrder(root.left, list);
        list.add(root);
        findInOrder(root.right, list);
    }

    public static void printTree(TreeNode root) {
        if (root == null) return;
        printTree(root.left);
        System.out.println(root.val);
        printTree(root.right);
    }
}
