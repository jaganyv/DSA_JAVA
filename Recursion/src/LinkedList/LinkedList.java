package LinkedList;

public class LinkedList {
    public static void main(String[] args){
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        head.next = second;
        ListNode third = new ListNode(30);
        second.next = third;
        ListNode fourth = new ListNode(40);
        third.next = fourth;
        ListNode five = new ListNode(50);
        fourth.next = five;

        //Insert at the beginning
        ListNode newNode = new ListNode(60);
        newNode.next = head;
        head = newNode;

        //Insert at end
        ListNode endNode = new ListNode(100);
        ListNode temp2 = head;

        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp2.next = endNode;

        ListNode temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
