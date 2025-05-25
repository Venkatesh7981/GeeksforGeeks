// User function Template for Java

class Solution {
    // Function to find the days of buying and selling stock for max profit.
    int stockBuySell(int arr[]) {
        // code here
         int ans=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i])ans+=arr[i+1]-arr[i];
        }
        return ans;
    }
}
