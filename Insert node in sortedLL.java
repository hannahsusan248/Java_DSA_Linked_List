class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

class Solution {
    Node sortedInsert(Node head, int key) {
        Node temp=head;
        Node newnode=new Node(key);
        if(key<head.data || head==null){
            newnode.next=head;
            head=newnode;
            return head;
        }
        while(temp.next!=null && temp.next.data<=key){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return head;
    }
}
