//{ Driver Code Starts
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // test cases

        Solution ob = new Solution();

        while (T-- > 0) {
            int n = sc.nextInt(); // input N
            int ans = ob.reverseExponentiation(n);
            System.out.println(ans);
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int num=n;
        int orgnum=n;
        int powerval=1;
        while(num>0){
            int lastdigit=num%10;
            if(lastdigit!=0){
                for(int i=0;i<lastdigit;i++){
                    powerval*=orgnum;
                }
            }
            num/=10;
        }
        return powerval;
    }
}
