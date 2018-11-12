package Design.LRUCache;

import java.util.HashMap;

public class LRUImplementation {

    ListNode head;
    ListNode tail;
    HashMap<Integer, ListNode> hashMap=new HashMap<>();
    int capacity;

    public  LRUImplementation(int capacity){
        this.capacity=capacity;
    }

    public int get(int key){

        if(hashMap.containsKey(key)){

            ListNode node=hashMap.get(key);
            remove(node);
            setHead(node);
            return node.value;
        }

        return -1;

    }


    public void remove(ListNode node){

        if(node.pre!=null){
            node.pre.next=node.next;
        }else{
            head=node.next;
        }

        if(node.next!=null){
            node.next.pre=node.pre;
        }else {
            tail=node.pre;
        }
    }

    public void setHead(ListNode node){

        node.next=head;
        node.pre=null;

        if(head!=null){

            head.pre=node;
        }

        head=node;

        if(tail==null){
            tail=head;
        }

    }

    public void set(int key, int value){

        if(hashMap.containsKey(key)){
            ListNode node=hashMap.get(key);
            node.value=value;
            remove(node);
            setHead(node);
        }else{
            ListNode created=new ListNode(key,value);
            if(hashMap.size()>capacity){
                hashMap.remove(tail.key);
                remove(tail);
                setHead(created);
            }else{
                setHead(created);
            }

            hashMap.put(key,created);
        }

    }

    public static void main(String[] args){

        LRUImplementation lruImplementation=new LRUImplementation(3);
        lruImplementation.set(1,1);
        lruImplementation.set(2,2);
        lruImplementation.set(3,3);
        lruImplementation.set(4,4);
        lruImplementation.set(5,5);

        System.out.println(lruImplementation.hashMap);
    }

}
