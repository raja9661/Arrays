public class CanBePlant {
    public static boolean IsWeCanPlant(int flowered[],int n)
    {
        int count=0;
        int start=0;
        int end=flowered.length-1;
        if(flowered[start]==0 && flowered[start+1]==0)
            {
                count++;
            }
            if(flowered[end]==0 && flowered[end-1]==0)
            {
                count++;
            }
        for(int i=2;i<flowered.length-1;i++)
        {
            if(flowered[i]==0)
            {
                if(flowered[i+1]==0 && flowered[i-1]==0)
                {
                    count++;
                }
            }
        }
        return count>=n;
    }
    public static void main(String args[])
    {
        int flowered[]={1,0,0,0,1};
        int n=1;
        System.out.print(IsWeCanPlant(flowered,n));
    }
    
}
