// { Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class ImplementAToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = 1;
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    
  int atoi(String str) {
      
    // Your code here
    int N = str.length();
    int res = 0;
    int val = 0;
    int sign = 1;
    // System.out.println(N);
    for (int i = 0; i < N; i++) {
    //   System.out.println(res);
      res *= 10;
      char x = str.charAt(i);
      switch (x) {
        case '0':
          val = 0;
          res += val;
          break;
        case '1':
          val = 1;
          res += val;
          break;
        case '2':
          val = 2;
          res += val;
          break;
        case '3':
          val = 3;
          res += val;
          break;
        case '4':
          val = 4;
          res += val;
          break;
        case '5':
          val = 5;
          res += val;
          break;
        case '6':
          val = 6;
          res += val;
          break;
        case '7':
          val = 7;
          res += val;
          break;
        case '8':
          val = 8;
          res += val;
          break;
        case '9':
          val = 9;
          res += val;
          break;
        case '-':
            if (sign == -1)
                return -1;
            sign = -1;
            break;
        default:
          return -1;
      }
    }
    return sign*res;
  }
}
