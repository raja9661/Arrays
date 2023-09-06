import java.util.*;
public class Prefix2Dmatrix2 {
    // public static int PrefixSum(int arr[][],int r1,int r2,int c1,int c2)
    // {
    //     int sum=0;
    //     for(int i=r1;i<=r2;i++)
    //     {
    //         for(int j=c1;j<=c2;j++)
    //         {
    //             sum +=arr[i][j];
    //         }
    //     }
    //     return sum;
    // }
    public static void PrefixSum(int arr[][])
    {
        //row wise sum
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                arr[i][j]=arr[i][j]+arr[i][j-1];
            }
        }
        //column wise sum
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=arr[i][j]+arr[i-1][j];
            }
        }

    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int rows=scn.nextInt();
        System.out.println("enter the number of columns:");
        int coln=scn.nextInt();
        int arr[][]=new int[rows][coln];
        System.out.println("enter the elements of array:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        // System.out.println("enter the first row:");
        // int r1=scn.nextInt();
        // System.out.println("enter the second row:");
        // int r2=scn.nextInt();
        // System.out.println("enter the first column:");
        // int c1=scn.nextInt();
        // System.out.println("enter the second column:");
        // int c2=scn.nextInt();
        // int sum=PrefixSum(arr,r1,r2,c1,c2);
        PrefixSum(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");   
            }
            System.out.println("");
        }
        // System.out.println(sum);
        
    }
}
