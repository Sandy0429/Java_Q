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
/*
below function is used to insert nodes in the linked list
public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }

*/
public static Node Merge (Node head1, Node head2){
//Enter your code here
    Node merge = null;    
    Node temp1 = head1;
    Node temp2 = head2;
    while(temp1 != null && temp2 != null){
        if(temp1.val <= temp2.val){
           
            merge = insert111(merge, temp1.val);
            temp1=temp1.next;
        }
        else{
           merge = insert111(merge, temp2.val);
            temp2=temp2.next;
        }
    }
    while(temp1 != null){
         merge = insert111(merge, temp1.val);
         temp1=temp1.next;
    }
    while(temp2 != null){
       merge = insert111(merge, temp2.val);
       temp2=temp2.next;
    }
    return merge;
}
