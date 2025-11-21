class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int arr[]=new int[256];
        for(char c:s.toCharArray()){
             arr[c-'a']++;
        }
         for(char c:s.toCharArray()){
             if(arr[c-'a']==1)
             return c;
         }
         return '$';

    }
}
