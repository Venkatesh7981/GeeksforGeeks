import java.util.*;
class Solution {
    boolean isPalindrome(String st) {
        // code here
                  if(st==null){
              return false;
          }
    
          return st.equals(new StringBuilder(st).reverse().toString());

    }
}