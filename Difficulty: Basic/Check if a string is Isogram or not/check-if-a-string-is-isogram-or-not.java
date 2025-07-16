

class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String s) {
        Set<Character> seen = new HashSet<>();
        // Your code here
        for(int i=1;i<=s.length();i++){
            char ch=s.charAt(i);
            if(seen .contains(ch)) return false;
            seen.add(ch);
        }
        return true;
        
    }
}