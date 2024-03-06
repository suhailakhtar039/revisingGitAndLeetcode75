package String;

class Pair{
    public int first;
    public int second;
}

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s="abbc";
        String ans = longestPalindrome(s);
    }
    public static String longestPalindrome(String s) {
        int n = s.length();
        if(n==1){
            return s;
        }
        int ans = 1;
        String res = "";
        for(int i = 0; i<n-1; i++){
            Pair pair = new Pair();
            int len1 = checkPalindrome(s,i,i+1, pair);
            if(len1 >= ans){
                res = s.substring(pair.first,pair.second+1);
                ans = len1;
            }
            int len2 = checkPalindrome(s,i,i,pair);
            if(len2 >= ans){
                res = s.substring(pair.first,pair.second+1);
                ans = len2;
            }
        }
        // System.out.println(res);
        return res;
    }
    public static int checkPalindrome(String s, int i, int j, Pair pair){
        int len = 0, n = s.length();
        while(i>=0 && j<n && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        i++;
        j--;
        pair.first = i;
        pair.second = j;
        return j-i+1;
    }
}
