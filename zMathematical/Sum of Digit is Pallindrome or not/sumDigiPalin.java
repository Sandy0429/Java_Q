//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        // code here
        int n =N, sum=0;
        while(n!=0){
            int l =n%10;
            sum = sum+l;
            n /= 10;
        }
        
        int m=sum;
        int rev=0;
        while(sum!=0){
            int l =sum%10;
            rev = rev*10+l;
            sum /= 10;
        }
        
        if(rev ==m)
            return 1;
        else 
            return 0;
        
        
        
        
        
    }
}
