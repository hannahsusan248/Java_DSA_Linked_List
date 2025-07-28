
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Solution {
    public static Node reverseKGroup(Node head, int k) {

        if (head == null || k <= 1) return head;
        Node temp=head;
        Node temp1=head;
        Stack<Integer> s= new Stack<>();
        while(temp!=null){
            int x=0;
            temp1=temp;
            while(x<k && temp!=null){
                s.push(temp.data);
                temp=temp.next;
                x++;
            }
            while(x>0){
                temp1.data=s.peek();
                temp1=temp1.next;
                s.pop();
                x--;
            }
        }
        return head;
    }
}
