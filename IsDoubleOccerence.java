import java.util.*;
public class IsDoubleOccerence {
    public static boolean DoubleOccurence(int arr[])
    {
        int j;
        Arrays.sort(arr);
        for(j=0;j<arr.length-1;j++)
        {
            if(arr[j]==arr[j+1])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,1};
        System.out.println(DoubleOccurence(arr));
    }
    
}
