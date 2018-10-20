package LinkedList;

import LinkedList.Implementation.ListNode;

public class MiddleOfALinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
