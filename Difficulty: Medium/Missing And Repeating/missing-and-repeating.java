//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        Set<Integer> num=new HashSet<>();
        Arrays.sort(arr);
        int []arr1=new int[2];
        for(int i:arr){
            if(num.contains(i)){
                arr1[0]=i;
            }
            else {
                num.add(i);
            }
        }
        for(int i=1;i<=arr.length;i++){
            if(!num.contains(i)){
                arr1[1]=i;
                break;
            }
        }
        return arr1;
    }
}