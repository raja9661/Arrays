import java.util.*;
public class MaxmProduct {
    public static int MaxProduct(int arr[])
    {
        Arrays.sort(arr);
        int product=0;
        int max=0;
        for(int i=0;i<arr.length-2;i++)
        {
            product=arr[i]*arr[i+1]*arr[i+2];
            if(product>max)
            {
                max=product;
            }
        }
        return max;

    }
    public static void main(String args[])
    {
        int arr[]={1,2,3};
        System.out.print(MaxProduct(arr));
    }
}
