package LinkedList.Easy;

import LinkedList.Implementation.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode next=null;
        ListNode previous=null;
        ListNode current=head;

        while(current!=null){

            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }

        return previous;
    }


}
