package String;

public class LongestCommonPractice {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int m = Integer.MAX_VALUE;
        for(String s:strs)m = Math.min(m, s.length());

        int i = 0, j = 0;
        for(j = 0; j<m; j++){
            char first = strs[0].charAt(j);
            boolean check = true;
            for(i = 0; i<n; i++){
                if(strs[i].charAt(j) != first){
                    check = false;
                    break;
                }
            }
            if(check == false)
                break;
        }

        String ans = strs[0].substring(0,j);
        return ans;
    }
}
