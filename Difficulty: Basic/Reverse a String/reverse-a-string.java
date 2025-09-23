// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
       StringBuilder st=new StringBuilder(s);
       return new StringBuilder(st).reverse().toString();
    }
}