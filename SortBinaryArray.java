static void swap(int arr[] , int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
	static int[] SortBinaryArray(int b[], int n) 
	{ 
	    // code here
	   int i = 0, j = 0;
       while(i < n)
       {
           if(b[i] == 0)
               swap(b, i, j++);
           i++;
       }
       return b;
	} 
