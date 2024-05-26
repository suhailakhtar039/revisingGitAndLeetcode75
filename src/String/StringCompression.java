package String;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aabb";

        char[] chars = s.toCharArray();
        int n = chars.length;
        int i = 0, indexAns = 0;
        while(i<n){
            char current = chars[i];
            int j = i;
            while(j<n && chars[j] == chars[i])j++;
            int length = j-i;
            chars[indexAns++] = current;
            if(length != 1){
                for(char c:Integer.toString(length).toCharArray())
                    chars[indexAns++] = c;
            }
            i=j;
        }
        System.out.println(chars);
        System.out.println(indexAns);
    }
}
