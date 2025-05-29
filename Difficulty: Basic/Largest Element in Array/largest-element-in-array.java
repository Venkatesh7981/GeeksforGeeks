class Solution {
    public static int largest(int[] arr) {
        // code here
        int large=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>large){
                large=num;
            }
        }
        return  large;
    }
}
