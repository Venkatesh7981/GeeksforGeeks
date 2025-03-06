//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            String s1 = sc.next(); // Take both the strings as input
            String s2 = sc.next();

            Solution obj = new Solution();

            // Call the lcs function with the lengths of the strings as
            // parameters
            System.out.println(obj.lcs(s1, s2));
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    int f(int i,int j,String s1,String s2,int dp[][]){
          int n1=s1.length();
           int n2=s2.length();
           if(i>=n1 || j>=n2)
               return 0;
            if(dp[i][j]!=-1){
                return dp[i][j];
            }   
           if(s1.charAt(i) == s2.charAt(j)){
               return dp[i][j]=1+f(i+1,j+1,s1,s2,dp);
           }else {
               return dp[i][j]= Math.max(f(i+1,j,s1,s2,dp),f(i,j+1,s1,s2,dp));
           }
     
    }
    static int lcs(String s1, String s2) {
        // code here
        
        
        Solution s=new Solution();
       int n1=s1.length();
       int n2=s2.length();
       int dp[][] = new int[n1+1][n2+1];
       for(int r[]:dp){
       Arrays.fill(r,0);
       }
       
     // return s.f(0,0,s1,s2,dp);
     // tabular
     for(int i=n1-1;i>=0;i--){
         for(int j=n2-1;j>=0;j--){
               if(s1.charAt(i) == s2.charAt(j)){
                   dp[i][j]=1+dp[i+1][j+1];
           }else {
               dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
           }
         }
     }
      
      return dp[0][0];  

    }
}