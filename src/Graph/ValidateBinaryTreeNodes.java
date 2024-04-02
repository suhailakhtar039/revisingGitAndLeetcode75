package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class ValidateBinaryTreeNodes {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] indegree = new int[n];
        int root = -1;
        for(int i = 0; i<n; i++){
            if(leftChild[i] != -1) indegree[leftChild[i]]++;
            if(rightChild[i] != -1) indegree[rightChild[i]]++;
        }

        for(int i = 0; i<n; i++){
            if(indegree[i] == 0){
                if(root == -1)
                    root = i;
                else
                    return false;
            }
        }
        if(root == -1)return false;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] vis = new boolean[n];
        queue.add(root);
        while(!queue.isEmpty()){
            int top = queue.poll();
            if(vis[top]){
                return false;
            }
            vis[top] = true;
            if(leftChild[top] != -1)queue.add(leftChild[top]);
            if(rightChild[top] != -1)queue.add(rightChild[top]);
        }
        int cnt = 0;
        for(boolean b: vis){
            if(b)cnt++;
        }
        boolean ans = (cnt == n);
        return ans;
    }
}
