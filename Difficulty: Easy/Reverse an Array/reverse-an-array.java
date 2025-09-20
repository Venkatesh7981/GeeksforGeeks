class Solution {
    public void reverseArray(int arr[]) {
        // code here
        if(arr.length==1 || arr.length==0){
            return ;
            
        }
        
        int temp;
        int low=0;
        int high=arr.length-1;
        while(low<high){
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            high--;
            low++;
        }
    }
}