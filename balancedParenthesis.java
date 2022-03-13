import java.util.*;
public class Main{
  static char matching(char c){
    if ( c == '}')
      return '{';
    else if ( c == ')')
      return '(';
    else if ( c == ']')
      return '[';
    else return '*';
  }
  static boolean isBalancedParenthesis(String st){
    Deque<Character> dq = new ArrayDeque<>();
    if ( st.length() == 0 || st.length() == 1 || st.length() % 2 == 1)
      return false;
    for ( int i = 0; i< st.length(); i++){
      if (dq.size() != 0 && matching(st.charAt(i)) == dq.peek()){
        dq.pop();
      }
      else
        dq.push(st.charAt(i));
      // System.out.println(dq.peek());
    }
    return dq.isEmpty();
    
  }
  public static void main(String [] args){
    String st = "((())){}";
    if (isBalancedParenthesis(st))
      System.out.println("String " + st + " is balanced.");
    else
      System.out.println("String " + st + " is not balanced.");
  }
}
