package String;


public class MinimumWindowSubstring {
    public static void solve(){
        String s = "ADOBECODEBANC";
        String t = "ABC";


        int[] m = new int[128];
        for(Character c: s.toCharArray()){
            m[c]++;
        }
        int start = 0, counter = t.length(), end = 0, minStart = 0, minLen = Integer.MAX_VALUE, size = s.length();

        while(end < size){
            if(m[s.charAt(end)] > 0){
                counter--;
            }
            m[s.charAt(end)]--;
            end++;

            // now main theory will start
            while (counter == 0){
                if(end-start<minLen){
                    minLen = end-start;
                    minStart = start;
                }
                m[s.charAt(start)]++;
                if(m[s.charAt(start)] > 0)
                    counter++;
                start++;
            }
        }
        if(minLen != Integer.MAX_VALUE)
            System.out.println(s.substring(minStart,minLen));
        System.out.println("");
    }
    public static void main(String[] args) {
        solve();
    }
}
