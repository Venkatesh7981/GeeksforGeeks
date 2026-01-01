class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
               int max=Integer.MIN_VALUE;
               int sum=0;
               for(int num:arr){
                   sum+=num;
               
               if(sum>max){
                   max=sum;
               }
               if(sum<0){
                   sum=0;
               }
                   
               }
               return max;
        
    }
}
