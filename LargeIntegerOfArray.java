public class LargeIntegerOfArray {
    public static int[] IncreamentLastValue(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr.length)
            {
                arr[i]++;
            }
        }
        return arr;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3};
        int res[]=IncreamentLastValue(arr);
       for(int i=0;i<res.length;i++)
       {
        System.out.print(res[i]+" ");
       }
    }
    
    
}
