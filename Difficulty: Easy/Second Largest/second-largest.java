class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int max=arr[0];
        int secmax=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                 secmax=max;
                max=arr[i];
            }
           else if(arr[i]>secmax && arr[i]<max){
                secmax=arr[i];
            }
        }
        
        return secmax;
    }
}