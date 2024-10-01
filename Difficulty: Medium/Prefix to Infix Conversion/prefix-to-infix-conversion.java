//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.preToInfix(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        String ans="";
         for(int i = pre_exp.length() - 1; i >= 0; i--){
           ans += pre_exp.charAt(i); 
           
       }
       Stack<String> st=new Stack<>();
       for(int i=0;i<ans.length();i++){
           char ch=ans.charAt(i);
           if((ch>='A'&& ch<='Z')|| (ch>='a'&& ch<='z')|| (ch>='0'&& ch<=9)){
              st.push(ch+""); 
           }
           else {
               String a=st.pop();
               String b = st.pop();
               String x = "(" + a + ch + b + ")";
               st.push(x);
           }
       }
       return st.peek();
    }
}
