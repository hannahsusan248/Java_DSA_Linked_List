
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

class Solution {
    public Node rotate(Node head, int k) {
        
        if(head==null || head.next==null ||k==0) return head;
        Node ptr=head;
        int n=1;
        while(ptr.next!=null){
            ptr=ptr.next;
            n++;
        }
        ptr.next=head;
        if(k>n){
            k=k%n;
        }
        int i=n-k;
        while(i-->0){
            ptr=ptr.next;
    
        }
        head=ptr.next;
        ptr.next=null;
        return head;
    }
}
