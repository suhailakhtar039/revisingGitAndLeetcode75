package String;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        int n = s.length;
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }
        for(char c: s){
            System.out.print(c + " ");
        }
    }
}
