class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if(arr.length<2) return -1;
        int max=-1;
        int secmax=-1;
        for(int num:arr){
            if(num>max){
              secmax=max;
              max=num;
            }
            else if(num<max && num>secmax){
            secmax=num;
        }
        }
        return secmax;
         
    }
}