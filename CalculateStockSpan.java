import java.util.Stack;

/*
  I need to find Span of a Stock
  What is a Span,
  It is the number of days for which the price is increasing consecutively(including the current day)
  for ex
  {1, 4, 2, 3}
  here index 3 have span = 2
*/
public class CalculateStockSpan{
  static void calculateSpan(int [] arr){
    /*
      make a stack to save large element on the left;
    */
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    st.push(0);
    System.out.println(1);
    for ( int i = 1; i < n; i++){
      while(!(st.isEmpty()) && arr[st.peek()] <= arr[i])
        st.pop();
      System.out.println(st.isEmpty() ?  i+1 : i - st.peek());
      st.push(i);
    }
  }
  public static void main(String[] args){
    int[] arr = { 2, 1, 1};
    calculateSpan(arr);
  }
}
