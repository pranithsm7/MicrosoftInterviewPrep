package CollectionsFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

    public static void main(String[] args){


        Queue<Integer> priorityQueue=new PriorityQueue<>();

        priorityQueue.offer(6);
        priorityQueue.offer(7);
        priorityQueue.offer(8);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        priorityQueue.clear();

        System.out.println(priorityQueue);


    }
}
