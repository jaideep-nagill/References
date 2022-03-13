import java.util.ArrayList;

class Stack {
  private ArrayList<Integer> arr = new ArrayList<>();

  public void push(int x){
    arr.add(x);
  }

  public int pop(){
    if ( arr.size() == 0)
      return -1;
    int last = arr.get(arr.size() - 1);
    arr.remove(arr.size() - 1);
    return last;
  }

  public boolean isEmpty(){
    if ( arr.size() == 0)
      return true;
    return false;
  }

  public int peek(){
    return arr.get(arr.size() -1);
  }
}

public class StackArrayLIst{
  public static void main(String [] args){
    Stack s = new Stack();
    for (int i = 1; i <=10; i++)
      s.push(i);
    s.push(11);
    System.out.println(s.pop());
    System.out.println(s.pop());
  }
}
