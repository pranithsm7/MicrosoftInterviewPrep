package LinkedList.Implementation;

public class Main {

    public static void main(String[] args){

        LinkedList linkedList=new LinkedList(4);
        linkedList.addAtHead(3);
        linkedList.addAtIndex(5,1);

        linkedList.printLinkedList();
    }
}
