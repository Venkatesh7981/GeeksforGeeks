//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int res = 0, count = 0, left = 0, right = 0;
        while (right < s.length()) {
            while (
                (left < right) &&
                ((count & (1 << (s.charAt(right) - 'a'))) > 0)
            ) {
                count ^= 1 << (s.charAt(left) - 'a');
                left += 1;
            }
            
            count ^= 1 << (s.charAt(right) - 'a');
            res = Math.max(res, right - left + 1);
            right += 1;
        }
        return res;
    }
}