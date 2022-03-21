// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class PalindromeString {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        String res = "";
        for ( int i = 0; i < S.length(); i++){
            res = S.charAt(i) + res;  
        }
        return S.equals(res) ? 1 : 0;
    }
};
