package String;

public class reverseVowels {
    public static void main(String[] args) {
        String s = "aeiouAEIOU";

        int n = s.length();
        char[] chars = s.toCharArray();
        int st = 0, en = n-1;
        while(st<en){
            while(st < en && !s.contains(chars[st]+""))
                st++;

            while(st < en && !s.contains(chars[en]+""))
                en--;
            char temp = chars[st];
            chars[st] = chars[en];
            chars[en] = temp;

            st++;en--;
        }
        System.out.println();
    }
}
