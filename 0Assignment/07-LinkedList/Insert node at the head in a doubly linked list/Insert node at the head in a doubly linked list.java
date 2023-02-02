/*

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/


public static Node insertnew(Node head,int k) { 

    Node tmp = new Node(k);
    tmp.next = head;
    tmp.prev = head.prev;
    head = tmp;
    return head;
}
