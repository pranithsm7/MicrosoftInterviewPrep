package Stack;

public class MyStack {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public MyStack(int size){
        maxSize=size;
        stackArray=new int[maxSize];
        top=-1;
    }

    public void push(int num){
        stackArray[++top]=num;
    }

    public int pop(){
        return stackArray[top--];
    }

    public int peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public static void main(String[] args){

        MyStack myStack=new MyStack(4);
        myStack.push(5);
        myStack.push(4);
        myStack.push(3);
        myStack.push(6);

        while(!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }

    }
}
