package Stack;

import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> stack;
    private Stack<Integer> tempstack;

    public QueueUsingStack(){
        stack=new Stack<>();
        tempstack=new Stack<>();
    }


    public void offer(int number){

        if(stack.empty()){
            stack.push(number);
        }else{

            while(stack.size()>0){
                tempstack.push(stack.pop());
            }
            stack.push(number);

            while (tempstack.size()>0){
                stack.push(tempstack.pop());
            }

        }
    }

    public int poll(){
        return stack.pop();
    }

    public boolean isEmpty(){
        return stack.size()==0;
    }

    public int peek(){
        return stack.peek();
    }

    public static void main(String[] args){
       QueueUsingStack queueUsingStack=new QueueUsingStack();
       queueUsingStack.offer(4);
       queueUsingStack.offer(3);
       queueUsingStack.offer(6);
       queueUsingStack.offer(7);

        System.out.println(queueUsingStack);
    }
}
