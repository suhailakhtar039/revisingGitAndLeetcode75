import java.util.ArrayList;
import java.util.List;
abstract class Example{
    void print(){
        System.out.println("example");
    }
}
class Example2 extends Example{
    @Override
    public void print(){
        System.out.println("Example2");
    }
}
public class PlayAround {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(4);
        l.add(3);
        Example2 example = new Example2();
        example.print();
    }
}
