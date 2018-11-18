package Design.CircularQueue;

import java.util.Stack;

class MyCircularQueue {

    private int front;
    private int rear;
    private int[] queueArray;
    private int size;
    private int capacity;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        capacity=k;
        front=0;
        rear=0;
        queueArray=new int[capacity];
        size=0;
        capacity=k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {

        if(size==capacity) {return false;}
        rear=(front+size)%capacity;
        queueArray[rear]=value;
        size++;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(size==0) return false;
        front=(front+1)%capacity;
        size--;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(size==0){
            return -1;
        }

        return queueArray[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(size==0) return -1;
        return queueArray[rear];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return size==0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return size==capacity;
    }


public static void main(String[] args){

    Stack<Integer> stack=new Stack<>();

    MyCircularQueue myCircularQueue=new MyCircularQueue(5);
    myCircularQueue.enQueue(1);
    myCircularQueue.enQueue(2);
    myCircularQueue.enQueue(3);
    myCircularQueue.enQueue(4);
    myCircularQueue.enQueue(5);

    System.out.println(myCircularQueue.Front());
    System.out.println(myCircularQueue.Rear());
}
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
