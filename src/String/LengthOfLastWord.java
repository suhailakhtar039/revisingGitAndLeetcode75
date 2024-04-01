package String;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "joyboy";
        int length = 0;
        int n = s.length();
        for(int i = n-1; i>=0; i--){
            if(s.charAt(i) != ' ')
                length++;
            else{
                if(length > 0)
                    return;
            }
        }
        System.out.println(length);
    }
}
