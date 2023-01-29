/*
// information about the class Nodeclass Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/


public static Node ReverseLinkedList(Node head) {
		// return the head of the modified linked list
        if(head == null){
            return head;
        }
        Node rev = null;
        Node temp = head;
        while(temp != null){
            Node next = temp.next;
            temp.next = rev;
            rev = temp;
            temp = next;
        }

        return rev;
    }
