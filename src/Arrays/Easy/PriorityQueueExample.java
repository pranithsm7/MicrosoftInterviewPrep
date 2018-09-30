package Arrays.Easy;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args){

        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(7);
        priorityQueue.add(0);

        System.out.println(priorityQueue);
    }
}
