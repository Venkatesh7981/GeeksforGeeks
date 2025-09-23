class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int evncount=0;
        int oddcount=0;;
        int n=arr.length;
        for(int i=0;i<n;i++){
             if(arr[i]%2==0)
             evncount++;
             else 
             oddcount++;
        }
        return new int[]{oddcount,evncount};
       
    }
}