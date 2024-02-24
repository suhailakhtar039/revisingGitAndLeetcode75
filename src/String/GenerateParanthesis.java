package String;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    private static List<String> ans = new ArrayList<>();
    public static void main(String[] args) {
        int n = 3;
        generateParanthesis1(0,0,3, "");
        for(String s : ans){
            System.out.println(s);
        }
    }
    public static void generateParanthesis1(int open, int close, int n, String temp){
        if(close == n){
            ans.add(temp);
            return;
        }
        if(open<n)
            generateParanthesis1(open+1, close, n, temp + "(");
        if(open > close)
            generateParanthesis1(open,close+1,n,temp + ")");
    }
}
