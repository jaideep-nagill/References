import java.util.Stack;
import java.util.*;

public class LargestAreaInAHistogram{
  static void previousSmaller(int[] arr,int[] ps){
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    ps[0] = -1;
    st.push(0);
    for ( int i = 1; i < n; i++){
      while(!(st.isEmpty()) && arr[st.peek()] >= arr[i])
        st.pop();
      ps[i] = st.isEmpty() ? -1 : st.peek();
      st.push(i);
    }
  }

  static void nextSmaller(int[] arr, int[] ns){
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    ns[n-1] = n;
    st.push(n-1);
    for ( int i = n-2; i >= 0; i--){
      while(!(st.isEmpty()) && arr[st.peek()] >= arr[i])
        st.pop();
      ns[i] = st.isEmpty() ? n : st.peek();
      st.push(i);
    }
  }

  public static void main(String [] args){
    int[] arr = {6, 2, 5, 4, 1, 5, 6};
    int n = arr.length;
    int res = 0;
    int curr = 0;
    int[] ps = new int[n];
    int[] ns = new int[n];
    previousSmaller(arr, ps);
    nextSmaller(arr, ns);
    for (int i = 0; i < n;  i++){
      curr = arr[i];
      curr += (i - ps[i] - 1)*arr[i];
      curr += (ns[i] - i - 1)*arr[i];
      // System.out.println(curr);
      res = res > curr ? res : curr;
    }
    System.out.println(res);
  }
}
