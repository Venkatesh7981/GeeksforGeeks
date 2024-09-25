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


// } Driver Code Ends
// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
//         // add your code here
//          Node temp=head;
//         int count0=0;
//         int count1=0;
//         int count2=0;
//         while(temp!=null){
//             if(temp.data==0) count0++;
//             else if(temp.data==1) count1++;
//             else count2++;
//             temp=temp.next;
//         }
//         temp=head;
//         while(temp!=null){
//             if(count0!=0){
//             temp.data=0;
//             count0--;
//             }
//             else if(count1!=0){
//                 temp.data=1;
//             count1--;
//             }
//             else{
//                 temp.data=2;
//             count2--;
//             }
//             temp=temp.next;
//         }
// return head;
 if(head==null) return head;
         Node zeronode=new Node(-1);
         Node onenode=new Node(-1);
         Node twonode=new Node(-1);

         Node zero=zeronode;
         Node one=onenode;
         Node two=twonode;
         Node temp=head;
         while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }
            else if(temp.data==1){
                one.next=temp;
                one=one.next;
            }
            else{
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
         }
         zero.next = (onenode.next != null) ? onenode.next : twonode.next;
         one.next=twonode.next;
         two.next=null;
         Node newnode=zeronode.next;
         return newnode; 
    }
}
    


//{ Driver Code Starts.

class GFG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); i++) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            head = new Solution().segregate(head);
            printList(head);
        }
    }
}
// } Driver Code Ends