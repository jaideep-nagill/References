// import java.lang.Exception;

class Stack {
  private int top;
  private int [] arr;
  private int cap;

  public Stack(int c){
    top = -1;
    arr = new int[c];
    cap = c;
  }
  
  public void push(int x){
    if ( top+1 == cap){
      System.out.println("StackOverFlow");
      return;
    }
    arr[++top] = x;
  }

  public int pop(){
    if ( top == -1){
      System.out.println("StackUnderFlow");
      return -1;
    }
    return arr[top--];
  }

  public int peek(){
    if ( top == -1){
      System.out.println("StackUnderFlow");
      return -1;
    }
    return arr[top];
  }

  public boolean isEmpty(){
    return (top == -1 ? true : false);
  }

  public int size(){
    return (top+1);
  }

  public int capacity(){
    return cap;
  }
}

public class Main{
  public static void main(String [] args){
    Stack s = new Stack(10);
    for (int i = 1; i <=10; i++)
      s.push(i);
    s.push(11);
    System.out.println(s.pop());
    System.out.println(s.pop());
  }
}
