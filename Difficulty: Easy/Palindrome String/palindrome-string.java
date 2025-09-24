class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder st=new StringBuilder(s);
         String rev=st.reverse().toString();
       return s.equals(rev);
    }
}