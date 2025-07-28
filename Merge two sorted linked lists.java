
class Node
{
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
}
class Solution {
    Node sortedMerge(Node head1, Node head2) {
       
        Node temp1=head1;
        Node temp2=head2;
        Node newnode=null;
        if(temp1==null && temp2==null) return null;
        if(temp1==null) return temp2;
        if(temp2==null) return temp1;
        Node temp3=null;
        if(temp1.data<temp2.data){
            newnode=head1;
            temp3=head1;
            temp1=temp1.next;
        }
        else{
            newnode=head2;
            temp3=head2;
            temp2=temp2.next;
        }
        while(temp1!=null && temp2!=null){
            if(temp1.data <temp2.data){
                temp3.next=temp1;
                temp3=temp3.next;
                temp1=temp1.next;
            }
            else{
                temp3.next=temp2;
                temp3=temp3.next;
                temp2=temp2.next;
            }
        }
        while(temp1!=null){
            temp3.next=temp1;
            temp3=temp3.next;
            temp1=temp1.next;

        }
        while(temp2!=null){
            temp3.next=temp2;
            temp3=temp3.next;
            temp2=temp2.next;
        }
        return newnode;
    }
}
