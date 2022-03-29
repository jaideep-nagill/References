  
// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseWordsInString {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int t = 1;
    while (t > 0) {
      String s = sc.next();
      Solution obj = new Solution();
      System.out.println(obj.reverseWords(s));
      t--;
    }
    sc.close();
  }
}
// } Driver Code Ends

class Solution {
  // Function to reverse words in a given string.
  String reverseWords(String S) {
    // code here
    String[] arr = S.split("\\.");
    int start = 0, end = arr.length - 1;
    while (start < end) {
      String temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    String res = arr[0];
    for (int i = 1; i < arr.length; i++) {
      res += "." + arr[i];
    }
    return res;
  }
}
