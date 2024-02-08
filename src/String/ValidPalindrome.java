package String;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {
    public static void isPalindrome(){
        String s = "0P";


        List<Character> l = new ArrayList<>();
        for(Character c: s.toLowerCase().toCharArray()){
            if((c >= 'a' && c<= 'z') || (c>='A' && c<='Z') || (c >= '0' && c <= '9')) {
                l.add(c);
            }
        }
        int n = l.size();
        if(n == 0){
            System.out.println("true");
            return;
        }
        for(int i = 0; i<n/2; i++){
            if(l.get(i) != l.get(n-i-1)){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
        return;
    }
    public static void main(String[] args) {
        isPalindrome();
    }
}
