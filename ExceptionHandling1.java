public class ExceptionHandling1 {
    public static void main(String args[])
    {
        int num1=10;
        int num2=0;
        int res=0;
        try {
            {
                res=num1/num2;
            }
        } catch (Exception e) {
            System.out.println("we cannot divide num by zero"+e);
        }
        System.out.println(res);
        System.out.println("Bye");
    }
}
