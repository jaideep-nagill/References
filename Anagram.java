
// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Anagram {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = 1;
    while (t-- > 0) {
      String str = br.readLine();
      String s1 = str.split(" ")[0];
      String s2 = str.split(" ")[1];

      Solution obj = new Solution();

      if (obj.isAnagram(s1, s2)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}// } Driver Code Ends

class Solution {
  // Function is to check whether two strings are anagram of each other or not.
  public static boolean isAnagram(String a, String b) {
    // Your code here
    if (a.length() != b.length())
      return false;
    int[] charArr = new int[256];
    Arrays.fill(charArr, 0);
    for (int i = 0; i < a.length(); i++) {
      charArr[a.charAt(i)]++;
      charArr[b.charAt(i)]--;
    }
    for (int i = 0; i < 256; i++)
      if (charArr[i] != 0)
        return false;
    return true;
  }
}
