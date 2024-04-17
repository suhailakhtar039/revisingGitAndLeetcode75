package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCards {
    public static void main(String[] args) {
        int[] deck = {17, 13, 11, 2, 3, 5, 7};

        int n = deck.length;
        Arrays.sort(deck);
        int[] res = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) queue.add(i);
        for (int i = 0; i < n; i++) {
            res[queue.poll()] = deck[i];
            queue.add(queue.poll());
        }
    }
}
