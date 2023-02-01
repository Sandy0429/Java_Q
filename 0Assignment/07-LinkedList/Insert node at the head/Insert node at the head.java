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

public static Node addElement(Node head, int k) {
//enter your code here
    
    Node first = new Node(k);
    
    if(head == null){
        head = first;
        return head;
    }

    first.next = head;
    head = first;
    
    return head;
}
