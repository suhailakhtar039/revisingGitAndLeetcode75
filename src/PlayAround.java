import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

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
        /*List<Integer> l = new ArrayList<>();
        l.add(4);
        l.add(3);
        Example2 example = new Example2();
        example.print();
        */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(8);
        pq.add(54);
        pq.add(12);
        pq.add(13);
        while(pq.size()!=0){
            System.out.println(pq.poll());
        }
    }
}
