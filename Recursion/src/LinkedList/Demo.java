package LinkedList;

class ListNode{
    int value;
    ListNode next;
    ListNode(int value){
        this.value = value;
        this.next = null;
    }
}
public class Demo {
    public static void main(String[] args){

        ListNode head = new ListNode(10);
        ListNode secondNode = new ListNode(20);
        head.next = secondNode;
        ListNode thirdNode = new ListNode(30);
        secondNode.next = thirdNode;

        //Insert At Beginning
        ListNode newNode = new ListNode(5);
        newNode.next = head;
        head = newNode;

        //Insert At End
        ListNode endNode = new ListNode(50);
        ListNode temp2 = head;

        while(temp2.next !=null){
            temp2 = temp2.next;
        }
        temp2.next = endNode;
        ListNode temp = head;

        //Insert At Middle
        int pos = 3;
        ListNode midNode = new ListNode(77);
        ListNode temp3 = head;
        for(int i=1;i<pos-1;i++){
            temp3 = temp3.next;
        }
        midNode.next = temp3.next;
        temp3.next = midNode;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }
}
