//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int K = Integer.parseInt(S[0]);
            int L = Integer.parseInt(S[1]);
            int R = Integer.parseInt(S[2]);
            int X = Integer.parseInt(S[3]);
            int Y = Integer.parseInt(S[4]);
            Solution ob = new Solution();
            System.out.println(ob.easyProblem(K, L, R, X, Y));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int easyProblem(int K, int L, int R, int X, int Y) {
        // code here
         int A=L;
        int B=X;
        if(X>R){
          return 0;  
        }
        while(A<=R && B<=Y){
            if((A==B*K)){
                return 1;
            }
            if(A<B*K){
                A++;
            }else{
                B++;
            }
        }
        return 0;
    }
}