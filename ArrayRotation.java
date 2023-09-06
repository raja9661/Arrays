import java.util.*;
class ArrayRotation
{
    public static void arrRotation(int arr[][])
    {
        //Tranpose of array;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr[0].length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            int li=0;
            int ri=arr.length-1;
            while(li<ri)
            {
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row:");
        int rowN=sc.nextInt();
        System.out.println("enter the number of column:");
        int colN=sc.nextInt();
        int arr[][]=new int[rowN][colN];
        System.out.println("enter the Elements of array:");
        for(int i=0;i<rowN;i++)
        {
            for(int j=0;j<colN;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        arrRotation(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");

        }

    }
}