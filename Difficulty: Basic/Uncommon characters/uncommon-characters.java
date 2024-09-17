//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
          String ans="";
        for(int i=0;i<A.length();i++){
            if(!B.contains(String.valueOf(A.charAt(i)))){
                if(!ans.contains(String.valueOf(A.charAt(i))))
                ans+=A.charAt(i);
            }
        }
        for(int i=0;i<B.length();i++){
            if(!A.contains(String.valueOf(B.charAt(i)))){
                if(!ans.contains(String.valueOf(B.charAt(i))))
                ans+=B.charAt(i);
            }
        }
        if(ans.isEmpty())return "-1";
        char array[]=ans.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}