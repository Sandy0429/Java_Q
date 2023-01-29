/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node deleteMiddleElement(Node head) {
		// return the head of the modified Linked List
        if(head.next == null){
            head.val = -1;
            return head;
        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
       int mid = count/2;
    //    System.out.println();
        temp = head;
        count =0;
        while(count != mid-1){
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;

        return head;
    }
