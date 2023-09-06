import java.util.*;
public class RepeatAndMissingVal {
    public static class Pair
    {
        int misVal;
        int repVal;
    }
    public static Pair RepAndMisVal(int arr[])
    {
        Pair p=new Pair();
        Arrays.sort(arr);
        int start=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                p.repVal=arr[i];
            }
            if(start!=arr[i])
            {
                p.misVal=start;
            }
            start++;
        }
        return p;
    }

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,4,5,7};
        Pair RepMis=RepAndMisVal(arr);
        System.out.print(RepMis.repVal);
        System.out.print(" "+RepMis.misVal);
    }
    
}
