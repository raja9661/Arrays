import java.util.*;
public class SearchTargetInMatrix {
    public static boolean SearchTarget(int matx[][],int target)
    {
        int rows = matx.length;
        int cols = matx[0].length;
        
        int row = rows - 1;
        int col = 0;
        
        while (row >= 0 && col < cols) {
            if (target == matx[row][col]) {
                return true;
            } else if (target < matx[row][col]) {
                row--;
            } else {
                col++;
            }
        }
     return false;
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int matx[][]={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        System.out.println("enter the target");
        int target=scn.nextInt();
        System.out.print(SearchTarget(matx,target));
    }
}
