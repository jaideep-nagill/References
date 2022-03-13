import java.util.Stack;
import java.util.*;

public class BuiltinStackAndArrayDeque{
  public static void main(String [] args){
    Stack<Integer> st = new Stack<Integer>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.push(6);
    System.out.println(st.pop());
    System.out.println(st.peek());
    System.out.println(st.isEmpty());
    System.out.println(st);

    Deque<Integer> ad = new ArrayDeque<Integer>();
    ad.push(1);
    ad.push(2);
    ad.push(3);
    ad.push(4);
    ad.push(5);
    ad.push(6);
    System.out.println(ad);
    ad.pop();
    System.out.println(ad.peek());
  }
}
