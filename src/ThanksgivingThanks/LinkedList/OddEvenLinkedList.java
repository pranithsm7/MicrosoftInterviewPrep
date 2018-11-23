package ThanksgivingThanks.LinkedList;

import Design.LRUCache.ListNode;

public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        ListNode leftDummy=new ListNode(0);
        ListNode rightDummy=new ListNode(0);

        ListNode left=leftDummy;
        ListNode right=rightDummy;
        int i=0;

        while(head!=null){
            if(i%2==0){
                left.next=head;
                left=head;
            }else{
                right.next=head;
                right=head;
            }
            head=head.next;
            i++;
        }

        right.next=null;
        left.next=rightDummy.next;

        return leftDummy.next;
    }
}
