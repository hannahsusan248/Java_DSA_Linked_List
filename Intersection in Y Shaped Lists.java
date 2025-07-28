/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    static Node intersectPoint(Node head1, Node head2) {
        // code here
        Node temp1=head1;
        Node temp2=head2;
        int h1=0,h2=0;
        int k;
        while(temp1!=null){
            h1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            h2++;
            temp2=temp2.next;
        }
        if(h1>h2){
            k=h1-h2;
            temp1=head1;
            temp2=head2;
        }
        else{
            k=h2-h1;
            temp1=head2;
            temp2=head1;
        }
        while(k>0){
            temp1=temp1.next;
            k--;
        }
        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
}
