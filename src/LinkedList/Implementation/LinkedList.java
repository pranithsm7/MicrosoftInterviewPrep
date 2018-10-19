package LinkedList.Implementation;

public class LinkedList {

    private Node head;


    public LinkedList(int data) {
        head = new Node(data);
    }


    public void addAtHead(int data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;

    }

    public void addAtTail(int data) {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node node = new Node(data);
        temp.next = node;
    }

    public void addAtIndex(int data, int position) {

        Node temp = head;
        int i = 0;
        while (i < position) {
            temp = temp.next;
            i++;
        }

        Node holder = temp.next;
        Node node = new Node(data);
        temp.next = node;
        node.next = holder;
    }

    public void printLinkedList(){

        Node node=head;

        while(node!=null){
            System.out.print(node.data+"->");
            node=node.next;
        }
    }

}
