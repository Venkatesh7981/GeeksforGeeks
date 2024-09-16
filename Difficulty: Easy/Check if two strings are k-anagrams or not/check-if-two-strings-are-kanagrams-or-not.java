//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
class GFG {
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0)
    	{
    		String str1=sc.next();
    		String str2=sc.next();
    		int k=sc.nextInt();
            Solution ob = new Solution();
    		if (ob.areKAnagrams(str1, str2, k) == true)
    			System.out.println("1");
    		else
    			System.out.println("0");
    	}
    }
}
// } Driver Code Ends


//User function template for JAVA

class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        if(s1.length()!=s2.length()) return false;
        ArrayList<Character> ans=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            ans.add(s2.charAt(i));
        }
        int count=0;
        for(int j=0;j<s1.length();j++){
            char c=s1.charAt(j);
            if(ans.contains(c)) ans.remove(Character.valueOf(c));
            else count++;
        }
        if(count>k) return false;
        else return true;
    }
}