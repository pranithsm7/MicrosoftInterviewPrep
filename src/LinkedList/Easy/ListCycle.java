package LinkedList.Easy;

import LinkedList.Implementation.ListNode;

public class ListCycle {

    public boolean hasCycle(ListNode head) {


        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}