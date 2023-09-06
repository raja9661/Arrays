import java.util.*;
public class lengthOfHarmoniousArr {
    public static int lengthOflongSqquence(int arr[])
    {
        Arrays.sort(arr);
        int min=arr[0];
        int max=arr[1];
        int count=0;
        for(int i=1;i<arr.length-1;i++)
        {
            if(max-min==1)
            {
                count++;
            }
            if(arr[i]>=arr[i+1] && arr[i]>max)
            {
                max=arr[i];
            }
            else
            {
                if(arr[i+1]>max)
                {
                    max=arr[i+1];
                }
            }
            if((arr[i]<=arr[i+1] && arr[i]<max))
            {
                min=arr[i];
            }
            else
            {
                if(arr[i+1]<min)
                {
                    min=arr[i+1];
                }
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int arr[]={1,3,2,2,5,2,3,7};
        int res=lengthOflongSqquence(arr);
        System.out.println(res);
    }
}
