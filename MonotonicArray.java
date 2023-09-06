public class MonotonicArray {
    public static boolean IsMonotonic(int arr[])
    {
        boolean inc=true;
        boolean dec=true;
        for (int i = 0; i < arr.length-1; i++) {
     
          if (arr[i] > arr[i + 1]) {
            inc= false;
          }
        }
        for (int i = 0; i < arr.length-1; i++) {
     
            if(arr[i] < arr[i + 1]) {
            dec=false;
          }
          }

        return inc||dec;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,2,3};
        System.out.print(IsMonotonic(arr));
    }
    
}
