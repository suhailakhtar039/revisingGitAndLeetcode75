package Tree;

import java.util.ArrayList;
import java.util.List;

public class UniqueBST2 {
    public static void main(String[] args) {
        int n = 3;
        List<TreeNode> list = new ArrayList<>();
        list = construct(1, n);
        System.out.println(list);
    }

    private static List<TreeNode> construct(int st, int en) {
        List<TreeNode> list = new ArrayList<>();
        if (st > en) {
            list.add(null);
            return list;
        }
        for (int i = st; i <= en; i++) {
            List<TreeNode> left = construct(st, i - 1);
            List<TreeNode> right = construct(i + 1, en);

            for (int j = 0; j < left.size(); j++) {
                for (int k = 0; k < right.size(); k++) {
                    TreeNode root = new TreeNode(i, left.get(j), right.get(k));
                    list.add(root);
                }
            }
        }
        return list;
    }
}
