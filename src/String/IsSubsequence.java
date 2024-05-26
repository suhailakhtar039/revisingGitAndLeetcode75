package String;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "axbc", t="accbddec";

        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        while(i<n && j<m){
            if(s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }
        System.out.println(i == n);
    }
}
