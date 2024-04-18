package String;

public class Difference {
    public static void main(String[] args) {
        String s = "", t = "y";

        int[] random = new int[26];
        for(Character c:s.toCharArray())
            random[c-'a']++;
        for(Character c:t.toCharArray())
            random[c-'a']--;
        for(int i = 0; i<26; i++){
            if(random[i] != 0){
                char ans = (char)(i + 'a');
                System.out.println(ans);
                System.exit(0);
            }
        }

    }
}
