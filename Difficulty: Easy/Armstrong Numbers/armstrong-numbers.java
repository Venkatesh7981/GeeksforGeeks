// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int origdig=n;
        int count=0;
        int sum=0;
        
        int tempnum=n;
        while(tempnum!=0){
            tempnum/=10;
            count++;
        }
        tempnum=origdig;
        while(tempnum!=0){
             int dig=tempnum%10;
             sum+=Math.pow(dig,count);
             tempnum/=10;
            
        }
        if(sum==origdig) return true;
        else return false;
    }
 
}