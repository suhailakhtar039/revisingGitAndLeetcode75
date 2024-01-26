import java.util.ArrayList;
import java.util.List;

public class PlayAround {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(4);
        l.add(3);
        for(int i = 0; i<l.size(); i++)
            System.out.println(l.get(i));
    }
}
