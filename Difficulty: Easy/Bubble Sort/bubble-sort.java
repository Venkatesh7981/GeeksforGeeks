class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        int n=arr.length;
        boolean swap;
        for(int i=0;i<n-1;i++){
            swap =false;
             for(int j=0;j<n-i-1;j++){
                 if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                     swap=true;
                 }
             }
        }
        
    }
}