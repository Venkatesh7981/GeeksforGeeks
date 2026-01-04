class Solution {
    void selectionSort(int[] arr) {
        // code here
        
        for(int i=0;i<arr.length;i++){
            int min_i=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_i]){
                    min_i=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_i];
            arr[min_i]=temp;
        }
    }
}