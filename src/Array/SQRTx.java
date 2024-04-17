package Array;

public class SQRTx {
    public static void main(String[] args) {
        int x = 125;

        long ans = 1, st = 1, en = x / 2;
        long mid = 1;
        while (st <= en) {
            mid = (st + en) / 2;
            long temp = mid * mid;
            if (temp == x) {
                System.out.println(mid);
                break;
            } else if (temp < x)
                st = mid + 1;
            else
                en = mid - 1;
        }
        long no = mid * mid;
        if (no <= x)
            System.out.println(mid);
        else System.out.println(mid - 1);

    }
}
