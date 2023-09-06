import java.util.*;
class cal implements Runnable
{
    public void run()
    {
         System.out.println("implementing run method");   
    try {
    System.out.println("calculation task started");
    Scanner scn=new Scanner(System.in);
    System.out.println("Please enter first number:");
    int num=scn.nextInt();
    System.out.println("Enter second number");
    int num2=scn.nextInt();
    int c=num+num2;
    System.out.println("sum of two number is:"+c);
    } catch (Exception e) {
    }
}
}
public class ImplementRunnableInterface {
    public static void main(String args[])
    {
        cal c=new cal();
        Thread t=new Thread(c);
        t.start();
    }
}
