package String;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "aabb";

        int[] access = new int[26];
        for(Character c: s.toCharArray())
            access[c-'a']++;

        for(int i = 0; i<s.length(); i++){
            int cnt = access[s.charAt(i)-'a'];
            if(cnt == 1){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("exit");
    }
}
