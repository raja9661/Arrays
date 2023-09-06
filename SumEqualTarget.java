class SumEqualTarget
{
    static class Pair
    {
        int ind1;
        int ind2;
    }
    static Pair TargetValue(int arr[],int target)
    {
        Pair pval=new Pair();
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    pval.ind1=i;
                    pval.ind2=j;
                }
            }
        }
        return pval;
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=17;
        Pair result=TargetValue(arr,target);
        System.out.print(result.ind1);
        System.out.print(" "+result.ind2);
    
    }
}