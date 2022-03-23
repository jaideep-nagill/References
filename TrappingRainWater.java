import java.util.*;
//leftmaxarr
//rightmaxarr
//subtract current element in array from smaller out of lmaxarr and rmaxarr
//that's how much water it can have on itself;
public class TrappingRainWater{
  public static void main(String [] args){
    int arr[] = {7,4,0,9};
    int N = arr.length;
    int [] lmaxarr = new int[N];
    int [] rmaxarr = new int[N];
    int lmax=arr[0], rmax = arr[N-1], sub = 0;
    long result = 0;
    for (int i = 0; i < N; i++){
      if ( lmax < arr[i])
        lmax = arr[i];
      lmaxarr[i] = lmax;
    }
    for (int i = N-1; i >= 0; i--){
      if (rmax < arr[i])
        rmax = arr[i];
      rmaxarr[i] = rmax;
    }
    for (int i = 0; i < N; i++){
      sub = rmaxarr[i] < lmaxarr[i] ? rmaxarr[i] : lmaxarr[i];
      result += (sub -arr[i]);
    }
    System.out.println(result); 
  }
}
