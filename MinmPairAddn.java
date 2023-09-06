import java.util.*;
class MinmPairAddn
{
    public static int AddnofMinElement(int arr[])
    {
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<arr.length;i+=2)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String string[])
    {
        int arr[]={1,4,3,2};
        int res=AddnofMinElement(arr);
        System.out.println(res);
    }
}