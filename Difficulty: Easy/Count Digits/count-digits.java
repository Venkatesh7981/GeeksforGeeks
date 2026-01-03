class Solution {
    public int countDigits(int n) {
        // code here
        int count=0;
        while(n>0){
            int num=n%10;
            count=count+1;
            n=n/10;
        }
        return count;
    }
}
