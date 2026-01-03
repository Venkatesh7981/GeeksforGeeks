class Solution {
    public boolean isPalindrome(int n) {
        // code here
         int rev=0;
         int org=n;
         while(n>0){
             int dig=n%10;
             rev=rev*10+dig;
             n=n/10;
         }
         if(rev==org) return true;
         else return false;
    }
}