public class DIString {
    public static int[] Reconstructprem(String str)
    {
        char arr[]=str.toCharArray();
        int start=0;
        int end=arr.length;
        int res[]=new int[end+1];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='I')
            {
                res[i]=start;
                start++;
            }
            if(arr[i]=='D')
            {
                res[i]=end;
                end--;
            }
        }
        res[res.length-1]=start;
        return res;
    }
    public static void main(String args[])
    {
        String s="IDID";
        int arr[]=Reconstructprem(s);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
