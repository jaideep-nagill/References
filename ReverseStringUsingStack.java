// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class ReverseStringUsingStack {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}
// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        //code here
        int N = S.length();
        Stack<Character> st = new Stack<>();
        String result = "";
        for ( int i = 0; i < N; i++){
            st.push(S.charAt(i));
        }
        for (int i = 0; i < N; i++)
            result += st.pop();
        return result;
    }

}
