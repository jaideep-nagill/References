
// { Driver Code Starts
import java.util.*;

class Implementstrstr {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = 1;
    // sc.nextLine();
    while (t > 0) {
      String line = sc.nextLine();
      String a = line.split(" ")[0];
      String b = line.split(" ")[1];

      GfG g = new GfG();
      System.out.println(g.strstr(a, b));

      t--;
    }
  }
}// } Driver Code Ends

class GfG {
  // Function to locate the occurrence of the string x in the string s.
  int strstr(String s, String x) {
    // Your code here
    System.out.println(s + " " + x);
    int N = s.length();
    int M = x.length();
    for (int i = 0; i < N - M + 1; i++) {
      for (int j = 0; j < M; j++) {
        System.out.println(s.charAt(j + i));
        if (s.charAt(i + j) != x.charAt(j))
          break;
        if (j == (M - 1))
          return i;

      }
    }
    return -1;
  }
}
