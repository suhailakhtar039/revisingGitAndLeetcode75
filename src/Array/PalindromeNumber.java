package Array;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
    }
    public static boolean isPalindrome(int x) {
        if(x<0)return false;
        long x1 = reverse(x);
        boolean ans = false;
        while(x>0 && x1>0){
            long r1 = x%10, r2 = x1%10;
            if(r1 != r2){
                return false;
            }
            x/=10;
            x1/=10;
        }
        return true;
    }

    public static long reverse(long x){
        long d = 0;
        while(x>0){
            d = d*10 +x%10;
            x/=10;
        }
        return d;
    }
}
