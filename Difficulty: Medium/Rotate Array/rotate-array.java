// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int nums[], int d) {
        // add your code here
        
        int n=nums.length;
         d=d%n;
        reverse(nums,0,d-1);
        reverse(nums,d,n-1);
        reverse(nums,0,n-1);
    }
        static void reverse(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
             nums[start]=nums[end];
             nums[end]=temp;
             end--;
             start++;
        }
    
    }
}