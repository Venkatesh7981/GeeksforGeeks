class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int l=arr[0];
        int sl=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>l){
                sl=l;
                l=num;
            }
            else if(num<l && num>sl){
                sl=num;
            }
            else {
                continue;
            }
        }
        if(sl<0) return -1;
        return sl;
    }
}