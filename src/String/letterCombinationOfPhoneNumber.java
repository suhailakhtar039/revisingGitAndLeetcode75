package String;

import java.util.ArrayList;
import java.util.List;

public class letterCombinationOfPhoneNumber {
    static String[] phoneNumber = {"0", "1", "abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        String ans = "237";
        List<String> res = solve(ans);
        System.out.println(res);
    }

    public static List<String> solve(String digits) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        find(digits, res, 0, sb);
        return res;
    }
    public static void find(String digits, List<String> res, int index, StringBuilder sb){
        if(sb.length() >= digits.length()){
            res.add(sb.toString());
            return;
        }
        for(int j = 0; j < phoneNumber[digits.charAt(index)-'0'].length(); j++){
            sb.append(phoneNumber[digits.charAt(index)-'0'].charAt(j));
            find(digits,res,index+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
