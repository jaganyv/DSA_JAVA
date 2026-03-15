package LinkedList;

class CircularNode{
    int value;
    CircularNode next;
    CircularNode(int value){
        this.value = value;
        this.next = null;
    }
}
public class CircularlyLinkedList {
    public static void main(String[] args){
    CircularNode head = new CircularNode(10);
    CircularNode second = new CircularNode(20);
    CircularNode third = new CircularNode(30);

    head.next = second;
    second.next = third;
    third.next = head;

    CircularNode temp = head;

    do{
        System.out.print(temp.value + " -> ");
        temp = temp.next;
    }while(temp != head);
    System.out.println("null");
    }
}
