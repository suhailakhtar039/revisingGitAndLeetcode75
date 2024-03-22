package Tree;

public class SumRootToLeaf {
    public static void main(String[] args) {

    }
    public int sumNumbers(TreeNode root) {
        int ans = solve(root, 0, 0);
        return ans;
    }
    public int solve(TreeNode root, int sum, int finalAns){
        if(root == null)return 0;
        if(root.left == null && root.right == null){
            sum = sum*10 + root.val;
            finalAns+=sum;
            return finalAns;
        }
        int l = solve(root.left, sum*10 + root.val,finalAns);
        int r = solve(root.right, sum*10 + root.val,finalAns);
        return l+r;
    }
}
