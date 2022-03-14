import java.util.Stack;
import java.util.Locale.LanguageRange;

import javax.swing.plaf.metal.MetalTextFieldUI;

import java.lang.*;
import java.util.*;

public class Main{
  static void previousSmaller(int[] arr, int [] ps){
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    st.push(0);
    ps[0] = -1;
    for ( int i = 1; i < n; i++){
      while ( !(st.isEmpty()) && arr[st.peek()] >= arr[i])
      st.pop();
      ps[i] = st.isEmpty() ? -1 : st.peek();
      st.push(i);
    }
  }

  static void nextSmaller(int [] arr, int [] ns){
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    st.push(n-1);
    ns[n-1] = n;
    for ( int i = n-2; i >= 0; i--){
      while ( !(st.isEmpty()) && arr[st.peek()] >= arr[i])
      st.pop();
      ns[i] = st.isEmpty() ? n : st.peek();
      st.push(i);
    }
  }

  static int largestRectangle(int[] arr){
    int res = 0, n = arr.length, curr = 0;
    int[] ps = new int[n];
    int[] ns = new int[n];
    previousSmaller(arr, ps);
    nextSmaller(arr, ns);
    for (int i = 0; i < n; i++){
      curr = arr[i];
      curr += (i - ps[i] - 1)*arr[i];
      curr += (ns[i] - i - 1)*arr[i];
      res = res > curr ? res : curr;
    }
    return res;
  }

  static int maxRectangle(int [][] arr){
    int res = largestRectangle(arr[0]);
    for ( int i = 1; i < arr.length; i++){
      for ( int j = 0; j < arr[i].length; j++){
        if ( arr[i][j] == 1)
           arr[i][j] += arr[i-1][j];
      }
      res = Math.max(res, largestRectangle(arr[i]));
    }
    return res;
  }

  public static void main(String [] args){
    int [][] arr = {
      {1, 0, 0, 1, 1}, 
      {0, 0, 1, 1, 1}, 
      {1, 1, 1, 1, 1}, 
      {0, 1, 1, 1, 1}};
    System.out.println(maxRectangle(arr));
  }
}
