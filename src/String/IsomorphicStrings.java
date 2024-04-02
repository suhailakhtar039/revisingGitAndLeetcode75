package String;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "bar", t = "hal";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        return solve(s,t) && solve(t,s);
    }
    public static boolean solve(String s, String t){
        Map<Character,Character> m = new HashMap<>();
        if(s.length() != t.length())
            return false;
        for(int i = 0; i<s.length(); i++){
            if(!m.containsKey(s.charAt(i))){
                m.put(s.charAt(i), t.charAt(i));
            }else{
                if(m.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
        }
        return true;
    }
}
