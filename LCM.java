class Solution {
    static long HCF(long a, long b){
        if (b == 0)
            return a;
        return HCF(b, a % b);
    }
        
    public static long getSmallestDivNum(int N){
        // code here
        long tet = N,hcf = 0 ;
        for ( int i = N-1; i > 1; i--){
            hcf = HCF(i, tet);
            tet *= i/hcf;
        }
        return tet;
    }
}
