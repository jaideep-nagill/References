
class Stack{
  private int cap;
  private int[] arr;
  private int top1, top2;
  Stack(int cap){
    this.cap = cap;
    arr = new int[cap];
    top1 = -1;
    top2 = cap;
  }
  
  public void push1(int x){
    if ( top1< top2-1){
      arr[++top1] = x;
    }
    else{
      System.out.println("StackOverFlow");
    }
  }

  public void push2(int x){
    if ( top1< top2-1){
      arr[--top2] = x;
    }
    else{
      System.out.println("StackOverflow");
    }
  }

  public int pop1(){
    if ( top1 >= 0)
      return arr[top1--];
    else{
      System.out.print("StackUnderflow");
      return -1;
    }
  }

  public int pop2(){
    if ( top2 < cap)
      return arr[top2++];
    else{
      System.out.print("StackUnderflow");
      return -1;
    }
  }

  public int peek1(){
    if ( top1 >= 0)
      return arr[top1];
    else{
      System.out.print("StackUnderflow");
      return -1;
    }
  }

  public int peek2(){
    if ( top2 < cap)
      return arr[top2];
    else{
      System.out.print("StackUnderflow");
      return -1;
    }
  }

  public boolean isEmpty1(){
    return (top1 == -1);
  }

  public boolean isEmpty2(){
    return (top2 == cap);
  }
}

public class TwoStackInArray{
  public static void main(String [] args){
    Stack st = new Stack(10);
    st.push1(1);
    st.push2(2);
    st.push1(3);
    st.push2(4);
    st.push1(5);
    System.out.println(st.peek2());
  }
}
