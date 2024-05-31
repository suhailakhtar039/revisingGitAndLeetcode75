package String;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfVowels {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;



        int[] vowel = new int[128];
        vowel['a'] = vowel['e'] = vowel['i'] = vowel['o'] = vowel['u'] = 1;
        int cnt = 0, mxValue = 0;
        for(int i = 0; i<k; i++)
            cnt+=vowel[s.charAt(i)];
        mxValue = cnt;
        for(int i = k; i<s.length(); i++){
            cnt+= vowel[s.charAt(i)] - vowel[s.charAt(i-k)];
            mxValue = Math.max(cnt, mxValue);
        }
        System.out.println(mxValue);

    }
}
