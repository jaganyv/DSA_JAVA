package LinkedList;

class DoubleNode{
    int val;
    DoubleNode next;
    DoubleNode prev;
    DoubleNode(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLinkedList {
    public static void main(String[] args){
        DoubleNode head = new DoubleNode(10);
        DoubleNode second = new DoubleNode(20);
        DoubleNode third = new DoubleNode(30);
        DoubleNode newNode = new DoubleNode(05);

        //Insert At Beginning
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

        newNode.next = head;
        head.prev = newNode;

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        DoubleNode temp = head;

        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
