import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<Integer>();
        myPriorityQueue.add(1);
        myPriorityQueue.add(2);
        myPriorityQueue.add(3);
        for(int pq:myPriorityQueue){
            System.out.println(pq);
        }
        myPriorityQueue.remove(2);
        System.out.println("After removing");
        for (int i:myPriorityQueue){
            System.out.println(i);
        }
        myPriorityQueue.offer(4);
        for(int i:myPriorityQueue){
            System.out.println(i);
        }
        System.out.println(myPriorityQueue.peek());
        System.out.println(myPriorityQueue.element());
    }
}
