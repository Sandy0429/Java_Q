class Queue
{
 private Node front, rear; 
 private int currentSize;
 
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
       
    }
}
    
 public Queue()
 {
 front = null;
 rear = null;
 currentSize = 0;
 }
 
 
 public void dequeue()
 {
//enter your code here
    if(front != null)
        front = front.next;
 }
 

 public void enqueue(int data)
 {
 //enter your code here
    Node n1 = new Node(data);
    if(front == null){
        front = n1;
        rear = n1;
        return;
    }
    Node temp = front;
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = n1;
    rear = n1;
 }
 
 public void displayfront(){
     //enter your code here
     if(front == null){
         System.out.println(0);
         return;
     }
     System.out.println(front.val);
 }
}
