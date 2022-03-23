import java.util.*;

public class MajorityElement{
  public static void main(String [] args){
    int arr[] = {3};
    int N = arr.length;
    int majority = N/2 ;
    int elem=arr[0], count= 1;
    for ( int i = 1; i < N; i++){
      if ( count>0)
        if ( elem == arr[i])
          count++;
        else
          count--;
      else{
        count = 1;
        elem = arr[i];
      }
    }
    count = 0;
    for ( int i = 0; i < N; i++)
      if ( arr[i] == elem)
        count++;
    if ( count >majority)
      System.out.println(elem);
    else 
      System.out.println(-1);
  }
}
