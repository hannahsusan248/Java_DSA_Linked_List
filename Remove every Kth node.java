Link list Node
class Node
{
    Node next;
    int data;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
class Solution {
  Node deleteK(Node head, int k) {
        int c=0;
        Node prev=head;
        Node ptr=head;
        while(ptr!=null){
            c++;
            if(c==k){
                prev.next=ptr.next;
                c=0;
            }
            if(c!=0){
                prev=ptr;
            }
            ptr=ptr.next;
        }
        return head;
    }
}
