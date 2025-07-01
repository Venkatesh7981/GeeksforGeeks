class Solution {
    public void reverseArray(int arr[]) {
        // code here
   int left=arr.length-1;
   int right=0;
   while(left>right){
    int temp=arr[right];
    arr[right]=arr[left];
    arr[left]=temp;
    left--;
    right++;
   }
    }
}