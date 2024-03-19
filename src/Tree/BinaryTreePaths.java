package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(10);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(30);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        List<String> finalAns = new ArrayList<>();
        solve(root, ans, finalAns);
        return finalAns;
    }
    public void solve(TreeNode root, List<Integer> ans, List<String> finalAns){
        if(root == null)return;
        if(root.left == null && root.right==null){
            ans.add(root.val);
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i<ans.size()-1; i++){
                sb.append(ans.get(i));
                sb.append("->");
            }
            sb.append(ans.get(ans.size()-1));
            finalAns.add(sb.toString());
//            System.out.println(ans);
            ans.remove(ans.size()-1);
            return ;
        }
        ans.add(root.val);
        solve(root.left,ans,finalAns);
        solve(root.right,ans,finalAns);
        ans.remove(ans.size()-1);
    }
}
