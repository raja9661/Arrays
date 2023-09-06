import java.util.*;
public class RemovalOfValue {
    public static int RemovVal(int arr[],int val)
    {
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=val)
            {
                arr[index]=arr[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String args[])
    {
        int arr[]={0,1,2,2,3,0,4,2};
        int val=2;
        int res=RemovVal(arr,val);
        System.out.println("val:"+res);
        for(int i=0;i<res;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}
