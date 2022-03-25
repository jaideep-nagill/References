import java.util.*;

class SubsequenceOfString{
  public static void main(String [] args){
    //sub-sequence of a string
    String str = "abcdefg";
    String st = "acd";
    int j = 0;
    for(int i = 0; i < str.length() && j < st.length(); i++)
      if(str.charAt(i) == st.charAt(j))
        j++;

    System.out.println(j==st.length() ? "st is a sequence of str" : "st is not a sequence of str");
  }
}
