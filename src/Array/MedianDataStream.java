package Array;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder{
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    public void addNum(int x){
        // case 1
        if(maxHeap.size() == minHeap.size()){
            if(maxHeap.size() == 0){
                maxHeap.add(x);
                return;
            }
            if(x < maxHeap.peek())
                maxHeap.add(x);
            else
                minHeap.add(x);
        }
        // case 2
        else if(maxHeap.size() > minHeap.size()){
            if(x < maxHeap.peek()){
                int temp = maxHeap.poll();
                minHeap.add(temp);
                maxHeap.add(x);
            }
            else{
                minHeap.add(x);
            }
        }
        // case 3
        else{
            if(x > minHeap.peek()){
                int temp = minHeap.poll();
                minHeap.add(x);
                maxHeap.add(temp);
            }
            else{
                maxHeap.add(x);
            }
        }
    }

    public double findMedian(){
        int minTop = minHeap.size()!=0?minHeap.peek():0;
        int maxTop = maxHeap.size()!=0?maxHeap.peek():0;
        if(minHeap.size() == maxHeap.size()){
            return (minTop + maxTop)/2.0;
        }
        else if(minHeap.size()>maxHeap.size())
            return minTop;
        else
            return maxTop;
    }
}

public class MedianDataStream {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(4);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(7);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(1);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(5);
        System.out.println(medianFinder.findMedian());
    }
}
