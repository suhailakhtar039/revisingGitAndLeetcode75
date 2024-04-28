package String;

public class IndexOfFirstString {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        int n = haystack.length();
        for (int i = 0; i < n; i++) {
            int j = 0;
            int k = i;
            while (k < n && j < needle.length() && haystack.charAt(k) == needle.charAt(j)) {
                j++;
                k++;
            }
            if (j == needle.length()) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(-1);
    }
}
