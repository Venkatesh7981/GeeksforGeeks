class Solution {
    boolean isPalindrome(String st) {
        // code here
        // int n=st.length();
        // for(int i=0;i<n/2;i++){
        //     if(st.charAt(i)==st.charAt(n-i-1)){
        //         return true;
                
        //     }
            
        // }
        // return false;
        // int left=0;
        // int right=st.length()-1;
        // while(left<=right){
        //     if(st.charAt(left)!=st.charAt(right)) return false;
        //     left++;
        //     right--;
        // }
        // return true;
          if(st==null){
              return false;
          }
          return st.equals(new StringBuilder(st).reverse().toString());
    }
}