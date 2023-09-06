import java.util.*;
public class MergeTwoArray {
    public static void MergeArray(int num1[],int num2[],int m,int n)
    {
        int count=0;
        int newarr[]=new int[m+n];
        for(int i=0;i<m;i++)
        {
            newarr[i]=num1[i];
        }
        for(int i=m;i<newarr.length;i++)
        {
            newarr[i]=num2[count++];
        }

          Arrays.sort(newarr);
          
        for(int i=0;i<newarr.length;i++)
        {
            System.out.print(newarr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int num1[]={1,2,3,0,0,0};
        int m=3;
        int num2[]={2,5,6};
        int n=3;
        MergeArray(num1,num2,m,n);
    }
    
}
