// User function Template for Java

class Solution {
     public static int fact(int n){
            int fact=1;
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            return fact;
        }
    public int is_StrongNumber(int n) {
        // Code here
        int temp=n;
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=fact(dig);
            n=n/10;
        }
        return (sum==temp)? 1:0;
       
    }
}