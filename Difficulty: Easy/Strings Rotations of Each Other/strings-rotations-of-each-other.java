//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException{
		
		//taking input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//taking total count of testcases
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    //Reading the two Strings
		    String s1 = br.readLine();
		    String s2 = br.readLine();
		    
		    //Creating an object of class Rotate
		    Solution obj = new Solution();
		    
		    //calling areRotations method 
		    //of class Rotate and printing
		    //"1" if it returns true
		    //else "0"
		    if(obj.areRotations(s1,s2))
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}
// } Driver Code Ends



class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
          if(s2.length()!=s1.length())
        return false;
        
        String rotated  =s1+s1;
        int j=0;
        int count=0;

        for(int i=0; i<rotated.length(); ++i)
        {
            if(j==s2.length()) break;
            if(rotated.charAt(i)==s2.charAt(j))
            {
                ++count;
                ++j;
            }
        }

        if(count==s2.length())
            return true;

        return false;
    }
    
}