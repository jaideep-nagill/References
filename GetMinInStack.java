// { Driver Code Starts
  import java.util.*;
  import java.util.Stack;


  class GetMinInStack
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();
      while(T>0)
      {
        int q = sc.nextInt();
        GfG g = new GfG();
        while(q>0)
        {
          int qt = sc.nextInt();
          
          if(qt == 1)
          {
            int att = sc.nextInt();
            g.push(att);
            //System.out.println(att);
          }
          else if(qt == 2)
          {
            System.out.print(g.pop()+" ");
          }
          else if(qt == 3)
          {
            System.out.print(g.getMin()+" ");
          }
        
        q--;
        }
        System.out.println();
      T--;
      }
      
    }
  }
  
  
  // } Driver Code Ends
  
  
  class GfG
  {
      int minEle;
      Stack<Integer> s = new Stack<>();
      Stack<Integer> a = new Stack<>();
  
      /*returns min element from stack*/
      int getMin()
      {
    // Your code here
        if(a.isEmpty())
            return -1;
        return a.peek();
      }
      
      /*returns poped element from stack*/
      int pop()
      {
    // Your code here
        if (s.isEmpty())
            return -1;
        if(s.peek() == a.peek())
            a.pop();
        return s.pop();
      }
  
      /*push element x into the stack*/
      void push(int x)
      {
    // Your code here	
        if (a.isEmpty()){
            a.push(x);
            s.push(x);
            return;
        }
        s.push(x);
        if (x <= a.peek())
            a.push(x);
      }	
  }
  
  
