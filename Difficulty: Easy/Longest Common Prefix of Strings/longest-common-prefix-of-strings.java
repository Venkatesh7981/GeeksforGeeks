//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        Arrays.sort(arr);
        String str1=arr[0];
        String str2=arr[arr.length-1];
        String st="";
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==str2.charAt(i)){
                st+=str1.charAt(i);
                
            }
            else {
                break;
            }
        }
            if(st.length()==0){
                return "-1";
            }
        return st;
    }
}