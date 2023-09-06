public class CandyProblem {
    public static int NoOfCandyAliceEat(int candy[])
    {
        int count=1;
        for(int i=0;i<candy.length-1;i++)
        {
              if(candy[i]!=candy[i+1])
              {
                count++;
              }
        }
        return count;
    }
    public static void main(String args[])
    {
        int candy[]={1,1,2,2,3,3};
        int num=NoOfCandyAliceEat(candy);
        System.out.println("Alice can eat candy:"+num);
    }
    
}
