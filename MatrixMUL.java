import java.util.*;
class MatrixMUL
{
    public static void main(String args[])
    {
      Scanner scn=new Scanner(System.in);
      System.out.println("enter the elements of first matrix:");
      int arr1[][]=new int[3][3];
      int arr2[][]=new int[3][3];
      int arr3[][]=new int[3][3];
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
            arr1[i][j]=scn.nextInt();
        }
      }
      System.out.println("enter the elements of second matrix:");
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
            arr2[i][j]=scn.nextInt();
        }
      }
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
            int sum=0;
            for(int k=0;k<3;k++)
            {
                sum +=arr3[i][j]=arr1[i][k]*arr2[k][j];
               
            }
            arr3[i][j]=sum;
        }
      }
      System.out.println("sum of two matrix is:");
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
            System.out.print(arr3[i][j]);
            System.out.print("  ");
        }
            System.out.println("");
      }
    }
}