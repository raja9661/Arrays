public class SearchInSortedArray {
    public static int SearchINSorted(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        int arr[]={-1,0,3,5,9,12};
        int target=9;
        int res=SearchINSorted(arr,target);
        if(arr[res]==target)
        {
            System.out.println("Target is present at index:"+res);
        }
        else
        {
            System.out.println("Target is not present");
        }
    }
    
}
