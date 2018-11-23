package Design.LRUCache;

public class ListNode {

    public ListNode next;
    public ListNode pre;

    public int key;
    public int value;

    public ListNode(int key, int value){
        this.key=key;
        this.value=value;
    }

    public ListNode(int key){
        this.key=key;
    }
}
