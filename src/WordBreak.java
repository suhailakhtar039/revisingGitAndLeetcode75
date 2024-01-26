import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    public static boolean solve(){
        String s="leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");

        int n = s.length();
        if(n==0)
            return true;
        boolean[] wb = new boolean[n+1];

        for(int i = 1; i<= n; i++){
            if(wb[i] == false && wordDict.contains(s.substring(0,i)))
                wb[i] = true;

            if(wb[i] == true){
                if (i == n)
                    return true;

                for (int j = i+1; j <= n; j++)
                {
                    // Update wb[j] if it is false and can be updated
                    // Note the parameter passed to dictionaryContains() is
                    // subString starting from index 'i' and length 'j-i'
                    if (wb[j] == false && wordDict.contains( s.substring(i, j) ))
                        wb[j] = true;

                    // If we reached the last character
                    if (j == n && wb[j] == true)
                        return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(solve());
        // solve();
    }
}
