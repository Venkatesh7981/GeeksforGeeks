//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        }
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    
        // code here.
        private Node rev(Node head){
            Node temp=head;
            Node prev=null;
            while(temp!=null){
                Node temp_next = temp.next;
                temp.next=prev;
                prev=temp;
                temp=temp_next;
            }
            return prev;
            
    }
    public Node addOne(Node head) {
        
        head=rev(head);
        Node temp=head;
        int carry=1;
        while(temp!=null){
            temp.data=temp.data+1;
            
        if(temp.data<10){
            carry=0;
            break;
        }
        else{
        temp.data=0;
        carry=1;
        }
        temp=temp.next;
        }
        if(carry==1){
            Node newnode=new Node(1);
            head=rev(head);
            newnode.next=head;
            return newnode;
        }
        head=rev(head);
        return head;
    }
    
}