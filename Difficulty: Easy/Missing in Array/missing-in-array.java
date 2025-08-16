class Solution {
    int missingNum(int arr[]) {
        // code here
           Arrays.sort(arr);
           for(int i=1;i<=arr.length;i++){
               if(arr[i-1]!=i){
                   return i;
               }
           }
           return arr.length+1;
    }
}