package Stack;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePostorder {
    class Solution {
        public List<Integer> postorder(Node root) {
            List<Integer> list = new ArrayList<>();
            solve(list, root);
            return list;
        }
        public void solve(List<Integer> ans, Node root){
            if(root == null){
                return;
            }
            for(Node node:root.children)
                solve(ans,node);
            ans.add(root.val);
        }
    }
}
