class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;

        int largest = -1, secondLargest = -1;

        // Finding the largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        
        for(int j=0;j<n;j++){
            if(arr[j]>secondLargest && arr[j]!=largest){
              secondLargest=arr[j];   
            }
        }
        return secondLargest;
    }
}