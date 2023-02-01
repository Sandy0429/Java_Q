/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/
static public Node moveZeroes(Node head)
{
       // Your code here
        if (head == null)
            return null; 
       
        Node temp = head.next;
        Node prev = head;
        while (temp != null) {
 
            if (temp.data == 0) { 
                Node curr = temp;
                prev.next = temp.next;
                temp = prev.next; 
                curr.next = head;
                head = curr;
            }
            //if zero encounter then move the zero to the first position
            else {
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
}
