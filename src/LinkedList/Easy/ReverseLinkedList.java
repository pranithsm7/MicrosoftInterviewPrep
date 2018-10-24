package LinkedList.Easy;

import LinkedList.Implementation.LinkedList;
import LinkedList.Implementation.ListNode;


public class ReverseLinkedList {

    public LinkedList.Node reverseList(LinkedList.Node head) {
        LinkedList.Node next=null;
        LinkedList.Node previous=null;
        LinkedList.Node current=head;

        while(current!=null){

            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }

        return previous;
    }


    public static void main(String[] args){

        LinkedList linkedList=new LinkedList(4);
        linkedList.addAtHead(5);
        linkedList.addAtIndex(4,1);
        linkedList.addAtIndex(3,2);
        linkedList.addAtIndex(2,3);

    }


}
