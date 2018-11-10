package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

    private Queue<Integer> queue;
    private Queue<Integer> tempqueue;

    public StackUsingQueues(){

        queue=new LinkedList<>();
        tempqueue=new LinkedList<>();
    }

    public void push(int number){

        if(queue.isEmpty()){
            queue.offer(number);
        }else{

            while (queue.size()>0){
                tempqueue.offer(queue.remove());
            }

            queue.offer(number);

            while(tempqueue.size()>0){
                queue.offer(tempqueue.remove());
            }
        }
    }

    public int pop(){
        return queue.poll();
    }

    public boolean isEmpty(){
        return queue.size()==0;
    }

    public int topOfStack(){
        return queue.peek();
    }


    public static void main(String[] args){
        StackUsingQueues stackUsingQueues=new StackUsingQueues();
        stackUsingQueues.push(5);
        stackUsingQueues.push(4);
        stackUsingQueues.push(3);
        stackUsingQueues.push(2);

        System.out.println(stackUsingQueues);
    }
}
