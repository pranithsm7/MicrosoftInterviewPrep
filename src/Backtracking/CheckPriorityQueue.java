package Backtracking;

import java.util.PriorityQueue;

public class CheckPriorityQueue {

    public static void main(String[] args){

        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(2);

        System.out.println(priorityQueue);


        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());
        }
    }
}
