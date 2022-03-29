// { Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class ValidateIPAddress {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = 1;

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {

static int noOfDigits(int i) {
    if (i == 0)
      return 1;
    int res = 0;
    while (i > 0) {
      res++;
      i /= 10;
    }
    return res;
  }

  public boolean isValid(String s) {
    // Write your code here
        if (s.charAt(0) == '.' || s.charAt(s.length() - 1) == '.')
      return false;
    String[] arr = s.split("\\.");
    if (arr.length != 4)
      return false;
    
    for (int i = 0; i < 4; i++) {
      if (arr[i].length() == 0)
        return false;
        if (arr[i].matches("\\D"))
          return false;
      int x = Integer.parseInt(arr[i]);
      if (arr[i].length() > noOfDigits(x))
        return false;
      if (!(x >= 0 && x <= 255))
        return false;
    }
    return true;
  }
}
