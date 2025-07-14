// User function template for JAVA

class Solution {
    // Function to check if a string is Pangram or not.
    public static boolean checkPangram(String s) {
        // your code here
     String str="abcdefghijklmnopqrstuvwxyz";
     s=s.toLowerCase();
     for(int i=0;i<26;i++){
         char ch=str.charAt(i);
         if(!s.contains(ch+"")) return false;
         
     }
     return true;
    }
}