public class IsMountainArray {
    public static boolean MountArray(int arr[])
    {
        if(arr.length<3)
        {
            return false;
        }
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                start=arr[i+1];
            }
            else
            {
                break;
            }
        }
        for(int i=arr.length-1;i>0;i--)
        {
            if(arr[i]<arr[i-1])
            {
                end=arr[i-1];
            }
            else
            {
                break;
            }
        }
        if(start==end)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        int arr[]={0,2,3,4,5,3,1,0};
        System.out.print(MountArray(arr));
    }
    
}
