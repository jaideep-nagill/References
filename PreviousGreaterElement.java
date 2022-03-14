import java.util.Stack;

/*
  I need to find the closest previous greater element of the current element,
  For doing so I will use Stack;
*/
public class PreviousGreaterElement{
  static void previousGreaterElement(int [] arr){
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    /*
      Store the  element  inside the stack,
      Whenever a smaller element is found print this element and store that element,
      If a greater element is found pop() and replace the element with the new element,
      Print -1 for first element as there is no element on left side of it.
    */
    st.push(0);
    System.out.println(-1);
    for ( int i = 1; i < n; i++){
      while(!(st.isEmpty()) && arr[st.peek()] <= arr[i])
        st.pop();
      System.out.println(st.isEmpty() ? -1 : arr[st.peek()]);
      st.push(i);
    }

  }
  public static void main(String [] args){
    int [] arr = {1, 2, 4, 9, 10, 3, 9, 8, 11, 2, 3};
    previousGreaterElement(arr);
  }
}
