/* Structure of a Linked List Node
class Node
{
    int data;
    Node next;
    Node(int d) {
       data = d;
       next = null;
    }
}*/
class Solution {
    public Node sortLL(Node head) {
        // code here
        ArrayList<Integer> a=new ArrayList<>();
       Node l=head;
        while(head!=null){
            a.add(head.data);
            head=head.next;
        }
        Collections.sort(a);
        head=l;
        int i=0;
        
         while(head!=null){
             head.data=a.get(i);
            i++;
            head=head.next;
        }
        head=l;
        return head;
        
    }
}