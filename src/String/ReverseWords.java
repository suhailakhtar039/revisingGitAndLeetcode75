package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public String reverseWords(String example) {
        StringBuilder sb = new StringBuilder();
        int n = example.length();
        boolean spacePresent = true;
        for(int i = 0; i<n; i++){
            if((example.charAt(i) >='a' && example.charAt(i) <='z') || (example.charAt(i) >='A' && example.charAt(i) <='Z') || (example.charAt(i) >='0' && example.charAt(i) <='9') ){
                sb.append(example.charAt(i));
                spacePresent = false;
            }
            else{
                // space in the beginning
                if(example.charAt(i) == ' ' && spacePresent){
                    spacePresent = false;
                    continue;
                }
                char previous = example.charAt(i-1);
                if(previous == ' ');
                else sb.append(' ');
            }
        }
        if(sb.charAt(sb.length()-1) == ' ')
            sb.deleteCharAt(sb.length()-1);

        List<String> list = new ArrayList<>();

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<sb.toString().toCharArray().length; i++){
            if(sb.charAt(i) == ' '){
                list.add(ans.toString());
                ans.setLength(0);
                continue;
            }
            ans.append(sb.toString().charAt(i));
        }
        if(ans.length() != 0){
            list.add(ans.toString());
        }
        Collections.reverse(list);
        ans.setLength(0);
        int k = list.size();
        for(int i = 0; i<list.size()-1; i++){
            ans.append(list.get(i) + " ");
        }
        ans.append(list.get(list.size()-1));
        return ans.toString();
    }
}
