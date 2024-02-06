package String;

public class Anagram {
    public static void solve(){
        String s = "rat", t = "car";

        int[] a = new int[26];
        for(Character c: s.toCharArray())
            a[c-'a']++;
        for(Character d: t.toCharArray())
            a[d-'a']--;

        for(int i:a){
            if(i != 0)
                System.out.println("not angram");
        }
        System.out.println("anagram");
    }
    public static void main(String[] args) {
        solve();
    }
}
